package org.cognicxcontactcenter.service.Impl;


import lombok.extern.slf4j.Slf4j;
import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;
import org.cognicxcontactcenter.entities.server.CustomerCallDetails;
import org.cognicxcontactcenter.repository.local.LocalCombinedRepository;
import org.cognicxcontactcenter.repository.store.AgentToStoreRepository;
import org.cognicxcontactcenter.repository.store.CustomerToStoreRepository;
import org.cognicxcontactcenter.repository.store.OutBoundCallstoStoreRepository;
import org.cognicxcontactcenter.service.ContactCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import java.sql.Timestamp;
import java.util.List;
@Slf4j
@Service
public class ContactCenterServiceImpl implements ContactCenterService {
    private final Logger logger = LoggerFactory.getLogger(ContactCenterServiceImpl.class);
    private final AgentToStoreRepository agentToStoreRepository;
    private final CustomerToStoreRepository customerToStoreRepository;
    private final OutBoundCallstoStoreRepository outBoundCallstoStoreRepository;
    private final LocalCombinedRepository localCombinedRepository;
    private final int THREAD_POOL_SIZE = Runtime.getRuntime().availableProcessors();
//    private final ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    public ContactCenterServiceImpl(AgentToStoreRepository agentToStoreRepository, CustomerToStoreRepository customerToStoreRepository, OutBoundCallstoStoreRepository outBoundCallstoStoreRepository, LocalCombinedRepository localCombinedRepository) {
        this.agentToStoreRepository = agentToStoreRepository;
        this.customerToStoreRepository = customerToStoreRepository;
        this.outBoundCallstoStoreRepository = outBoundCallstoStoreRepository;
        this.localCombinedRepository = localCombinedRepository;
    }
    public Timestamp getLastTimeStamp() {
        return agentToStoreRepository.getLastTimeStamp();
    }

    public void updateValues() {
        try {
            try {
                Timestamp lastTimeStamp = agentToStoreRepository.getLastTimeStamp();
                Timestamp lastTime = customerToStoreRepository.lastTimeStamp();
                // Create and start a thread for the agent data operation
                Thread agentThread = new Thread(() -> {
                    try {
                        logger.info("An Info of last Timestamp (Agent): " + lastTimeStamp);
                        agentToStoreRepository.getall(lastTimeStamp);
                    } catch (Exception e) {
                        logger.error("An error occurring on adding agent data", e.getMessage());
                    }
                });
                agentThread.start();
                // Create and start a thread for the customer data operation
                Thread customerThread = new Thread(() -> {
                    try {
                        logger.info("An Info of last Timestamp (Customer): " + lastTime);
                        customerToStoreRepository.getall(lastTime);
                    } catch (Exception e) {
                        logger.error("An error occurring on Customer data fetching", e.getMessage());
                    }
                });
                customerThread.start();
                // Wait for both threads to finish using join
                agentThread.join();
                customerThread.join();
            } catch (Exception e) {
                logger.error("An error occurring in the main thread", e.getMessage());
            }
        }catch (Exception e){
            logger.error("An error occurring on SP Execution",e.getMessage());
        }
    }
}
