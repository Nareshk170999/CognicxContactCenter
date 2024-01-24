package org.cognicxcontactcenter.repository.store;

import org.cognicxcontactcenter.entities.server.AgentActivityDetails;
import org.cognicxcontactcenter.entities.server.CustomerCallDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface CustomerToStoreRepository extends JpaRepository<CustomerCallDetails,Integer> {


    @Query(value = "SELECT TOP 1 MAX(OriginatedStamp) AS max_timestamp FROM CustomerCallDetails GROUP BY SLNO ORDER BY max_timestamp DESC",nativeQuery = true)
    Timestamp lastTimeStamp();
    @Query(value = "exec InsertDataIntoTempTableCALL @LastProcessedTimestamp = :lastTimeStamp", nativeQuery = true)
    List<CustomerCallDetails> getall(@Param("lastTimeStamp") Timestamp lastTimeStamp);
}
