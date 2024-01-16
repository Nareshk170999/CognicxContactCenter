package org.cognicxcontactcenter.configuration;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "org.cognicxcontactcenter.repository.store",
        entityManagerFactoryRef = "serverEntityManagerFactory",
        transactionManagerRef = "serverTransactionManager"
)
public class ServerDataSourceConfig {
    private final Environment environment;
    @Autowired
    public ServerDataSourceConfig(Environment environment) {
        this.environment = environment;
    }
    @Bean(name = "server")
    @ConfigurationProperties(prefix = "spring.server.datasource")
    public DataSource serverDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.server.datasource.driverClassName"));
        dataSource.setJdbcUrl(environment.getProperty("spring.server.datasource.url"));
        return dataSource;
    }

    @Bean(name = "serverEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean destinationEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("server") DataSource dataSource, JpaProperties jpaProperties) {
        return builder
                .dataSource(dataSource)
                .packages("org.cognicxcontextcenter.entities.server")
                .persistenceUnit("Server")
                .properties(jpaProperties.getProperties())
                .build();
    }
    @Bean(name = "serverTransactionManager")
    public PlatformTransactionManager destinationTransactionManager(
            @Qualifier("serverEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}