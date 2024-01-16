package org.cognicxcontactcenter.repository.store;

import org.cognicxcontactcenter.entities.server.OutBoundCalls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutBoundCallstoStoreRepository extends JpaRepository<OutBoundCalls,Integer> {

}
