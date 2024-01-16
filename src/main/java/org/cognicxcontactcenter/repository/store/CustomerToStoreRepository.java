package org.cognicxcontactcenter.repository.store;

import org.cognicxcontactcenter.entities.server.CustomerCallDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerToStoreRepository extends JpaRepository<CustomerCallDetails,Integer> {
}
