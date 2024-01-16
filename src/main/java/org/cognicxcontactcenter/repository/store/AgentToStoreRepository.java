package org.cognicxcontactcenter.repository.store;

import org.cognicxcontactcenter.entities.server.AgentActivityDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface AgentToStoreRepository extends JpaRepository<AgentActivityDetails, Integer> {
    @Query(value = "SELECT TOP 1 MAX(timestamp) AS max_timestamp FROM AgentActivityDetails GROUP BY tenantID ORDER BY max_timestamp DESC",nativeQuery = true)
    Timestamp getLastTimeStamp();
}