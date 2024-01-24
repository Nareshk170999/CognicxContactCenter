package org.cognicxcontactcenter.repository.local;

import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface LocalCombinedRepository extends JpaRepository<LocalCombinedViewDTO, Integer> {


//    @Query(value = "exec InsertDataIntoTempTableExample @LastProcessedTimestamp = :timestamp", nativeQuery = true)
//    void getAll(@Param("timestamp") Timestamp timestamp);

//    @Query(value = "SELECT TOP 1 MAX(timestamp) AS max_timestamp FROM AgentActivityDetails1 GROUP BY tenantID ORDER BY max_timestamp DESC",nativeQuery = true)
//    Timestamp getLastTimeStamp();
}
