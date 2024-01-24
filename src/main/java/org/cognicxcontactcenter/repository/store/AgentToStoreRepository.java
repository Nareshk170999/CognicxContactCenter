package org.cognicxcontactcenter.repository.store;

import org.cognicxcontactcenter.entities.server.AgentActivityDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface AgentToStoreRepository extends JpaRepository<AgentActivityDetails, Integer> {

    @Query(value = "SELECT TOP 1 MAX(timestamp) AS max_timestamp FROM AgentActivityDetails GROUP BY SLNO ORDER BY max_timestamp DESC", nativeQuery = true)
    Timestamp getLastTimeStamp();


    @Query(value = "exec InsertDataIntoTempTableAALL @LastProcessedTimestamp = :lastTimeStamp", nativeQuery = true)
    List<AgentActivityDetails> getall(@Param("lastTimeStamp") Timestamp lastTimeStamp);
}