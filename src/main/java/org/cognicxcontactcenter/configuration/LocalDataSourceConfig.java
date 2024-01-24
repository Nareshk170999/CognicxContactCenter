package org.cognicxcontactcenter.configuration;//package org.cognicxcontextcenter.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.cognicxcontactcenter.service.Impl.ContactCenterServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "org.cognicxcontactcenter.repository.local",
        entityManagerFactoryRef = "localEntityManagerFactory",
        transactionManagerRef = "localTransactionManager"
)
public class LocalDataSourceConfig {

    private final Logger logger = LoggerFactory.getLogger(LocalDataSourceConfig.class);
    private final Environment environment;
    @Autowired
    public LocalDataSourceConfig(Environment environment) {
        this.environment = environment;
    }

    @Primary
    @Bean(name = "local")
    @ConfigurationProperties(prefix = "spring.local.datasource")
    public DataSource localDataSource() {
            HikariDataSource dataSource = new HikariDataSource();
            dataSource.setDriverClassName(environment.getProperty("spring.local.datasource.driverClassName"));
            dataSource.setJdbcUrl(environment.getProperty("spring.local.datasource.url"));
            return dataSource;
    }
    @Primary
    @Bean(name = "localEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean sourceEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("local") DataSource dataSource, JpaProperties jpaProperties) {
        return builder
                .dataSource(dataSource)
                .packages("org.cognicxcontextcenter.entities")
                .properties(jpaProperties.getProperties())
                .persistenceUnit("Local")
                .build();
    }

    @Primary
    @Bean(name = "localTransactionManager")
    public PlatformTransactionManager sourceTransactionManager(
            @Qualifier("localEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
