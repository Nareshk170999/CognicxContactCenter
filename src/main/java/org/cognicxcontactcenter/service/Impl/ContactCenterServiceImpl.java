package org.cognicxcontactcenter.service.Impl;



import lombok.extern.slf4j.Slf4j;
import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;
import org.cognicxcontactcenter.entities.server.AgentActivityDetails;
import org.cognicxcontactcenter.entities.server.CustomerCallDetails;
import org.cognicxcontactcenter.entities.server.OutBoundCalls;
import org.cognicxcontactcenter.repository.local.LocalCombinedRepository;
import org.cognicxcontactcenter.repository.store.AgentToStoreRepository;
import org.cognicxcontactcenter.repository.store.CustomerToStoreRepository;
import org.cognicxcontactcenter.repository.store.OutBoundCallstoStoreRepository;
import org.cognicxcontactcenter.service.ContactCenterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.*;
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

    private OutBoundCalls getOutBoundCallToStore(LocalCombinedViewDTO outBoundCalls) {
        logger.info("Setting values for OutBoundCalls entity");
        OutBoundCalls entity = new OutBoundCalls();
        entity.setTenantID(outBoundCalls.getTenantID());
        entity.setCustID(outBoundCalls.getCustID());
        entity.setSequenceID(Integer.valueOf(outBoundCalls.getSequenceID()));
        entity.setContactType(Integer.valueOf(outBoundCalls.getContactType()));
        entity.setContactTypeName(outBoundCalls.getContactTypeName());
        entity.setContactSubType(outBoundCalls.getContactSubType());
        entity.setSiteID(outBoundCalls.getSiteID());
        entity.setSiteName(outBoundCalls.getSiteName());
        entity.setSkillsetID(outBoundCalls.getSkillsetID());
        entity.setSkillsetName(outBoundCalls.getSkillsetName());
        entity.setAgentSurName(outBoundCalls.getAgentSurName());
        entity.setAgentGivenName(outBoundCalls.getAgentGivenName());
        entity.setSupervisorSurName(outBoundCalls.getSupervisorSurName());
        entity.setSupervisorGivenName(outBoundCalls.getSupervisorGivenName());
        entity.setAgentID(outBoundCalls.getAgentID());
        entity.setSupervisorID(outBoundCalls.getSupervisorID());
        entity.setOriginatedStamp(outBoundCalls.getOriginatedStamp());
        entity.setInitialDisposition(outBoundCalls.getInitialDisposition());
        entity.setHandlingTime(outBoundCalls.getHandlingTime());
        entity.setConsultTime(outBoundCalls.getConsultTime());
        entity.setHoldTime(outBoundCalls.getHoldTime());
        entity.setWaitTime(outBoundCalls.getWaitTime());
        entity.setNumberOfTimesOnHold(outBoundCalls.getNumberOfTimesOnHold());
        entity.setQaScore(outBoundCalls.getQaScore());
        logger.info("OutBoundCalls entity successfully populated");
        return entity;
    }

    private CustomerCallDetails getCustomerToStore(LocalCombinedViewDTO customerCallDetail) {
        logger.info("Setting values for CustomerCallDetails entity");
        CustomerCallDetails entity = new CustomerCallDetails();
        entity.setTenantID(customerCallDetail.getTenantID());
        entity.setCustID(customerCallDetail.getCustID());
        entity.setSequenceID(customerCallDetail.getSequenceID());
        entity.setGuid(customerCallDetail.getGuid());
        entity.setCcmID(customerCallDetail.getCcmID());
        entity.setContactType(customerCallDetail.getContactType());
        entity.setContactTypeName(customerCallDetail.getContactTypeName());
        entity.setContactSubType(customerCallDetail.getContactSubType());
        entity.setPriority(customerCallDetail.getPriority());
        entity.setSiteID(customerCallDetail.getSiteID());
        entity.setSiteName(customerCallDetail.getSiteName());
        entity.setApplicationID(customerCallDetail.getApplicationID());
        entity.setApplicationName(customerCallDetail.getApplicationName());
        entity.setLastTreatmentID(customerCallDetail.getLastTreatmentID());
        entity.setTreatment(customerCallDetail.getTreatment());
        entity.setLastTreatmentStamp(customerCallDetail.getLastTreatmentStamp());
        entity.setLastTreatmentTime(customerCallDetail.getLastTreatmentTime());
        entity.setSkillsetID(customerCallDetail.getSkillsetID());
        entity.setSkillsetName(customerCallDetail.getSkillsetName());
        entity.setLocalUserID(customerCallDetail.getLocalUserID());
        entity.setAgentSurName(customerCallDetail.getAgentSurName());
        entity.setAgentGivenName(customerCallDetail.getAgentGivenName());
        entity.setSupervisorSurName(customerCallDetail.getSupervisorSurName());
        entity.setSupervisorGivenName(customerCallDetail.getSupervisorGivenName());
        entity.setAgentID(customerCallDetail.getAgentID());
        entity.setSupervisorID(customerCallDetail.getSupervisorID());
        entity.setOriginatedStamp(customerCallDetail.getOriginatedStamp());
        entity.setInitialDisposition(customerCallDetail.getInitialDisposition());
        entity.setAppAbandonDelay(customerCallDetail.getAppAbandonDelay());
        entity.setAppAcceptedDelay(customerCallDetail.getAppAcceptedDelay());
        entity.setSksAbandonDelay(customerCallDetail.getSksAbandonDelay());
        entity.setSksAcceptedDelay(customerCallDetail.getSksAcceptedDelay());
        entity.setHandlingTime(customerCallDetail.getHandlingTime());
        entity.setConsultTime(customerCallDetail.getConsultTime());
        entity.setHoldTime(String.valueOf(customerCallDetail.getHoldTime()));
        entity.setNumberOfTimesOnHold(customerCallDetail.getNumberOfTimesOnHold());
        entity.setNumberOfTimesRTQ(customerCallDetail.getNumberOfTimesRTQ());
        entity.setFinalDisposition(customerCallDetail.getFinalDisposition());
        entity.setFinalDispositionStamp(customerCallDetail.getFinalDispositionStamp());
        entity.setPresentingTime(customerCallDetail.getPresentingTime());
        entity.setWaitTime(customerCallDetail.getWaitTime());
        entity.setContactOriginatedStamp(customerCallDetail.getContactOriginatedStamp());
        entity.setFinalDispositionInterval(customerCallDetail.getFinalDispositionInterval());
        entity.setServiceInterval(customerCallDetail.getServiceInterval());
        entity.setOriginatedInterval(customerCallDetail.getOriginatedInterval());
        entity.setDisconnectSource(customerCallDetail.getDisconnectSource());
        entity.setCallsConferenced(customerCallDetail.getCallsConferenced());
        entity.setCallsReturnToQ(customerCallDetail.getCallsReturnToQ());
        entity.setCallsReturnToQDueToTimeout(customerCallDetail.getCallsReturnToQDueToTimeout());
        entity.setIdleTime(customerCallDetail.getIdleTime());
        logger.info("CustomerCallDetails entity successfully populated");
        return entity;
    }
    private AgentActivityDetails getAgentToStore(LocalCombinedViewDTO agent) {
        logger.info("Setting values for AgentActivityDetails entity");
        AgentActivityDetails entity = new AgentActivityDetails();
        entity.setTenantID(agent.getTenantID());
        entity.setAgentGivenName(agent.getAgentGivenName());
        entity.setAgentID(agent.getAgentID());
        entity.setAgentSurName(agent.getAgentSurName());
        entity.setBreakTime(agent.getBreakTime());
        entity.setCallsAnswered(agent.getCallsAnswered());
        entity.setCallsOffered(agent.getCallsOffered());
        entity.setHoldTime(agent.getHoldTime());
        entity.setLoggedInTime(agent.getLoggedInTime());
        entity.setNotReadyTime(agent.getNotReadyTime());
        entity.setPostCallProcessingTime(agent.getPostCallProcessingTime());
        entity.setRingTime(agent.getRingTime());
        entity.setShortCallsAnswered(agent.getShortCallsAnswered());
        entity.setSite(agent.getSite());
        entity.setSiteID(agent.getSiteID());
        entity.setTalkTime(agent.getTalkTime());
        entity.setTime(agent.getTime());
        entity.setTimestamp(agent.getTimestamp());
        entity.setUserID(agent.getUserID());
        entity.setWaitingTime(agent.getWaitingTime());
        entity.setSupervisorLogin(agent.getSupervisorLogin());
        entity.setSupervisorGivenName(agent.getSupervisorGivenName());
        entity.setSupervisorSurName(agent.getSupervisorSurName());
        logger.info("Agent ActivityDetails entity successfully populated");

        return entity;
    }


    public Timestamp getLastTimeStamp() {
        return agentToStoreRepository.getLastTimeStamp();
    }

    public void updateValues() {
        Timestamp timestamp = agentToStoreRepository.getLastTimeStamp();
        logger.info("Last Time stamp from previous update : " + timestamp);
        try {
            try {
                List<LocalCombinedViewDTO> localCombinedViewDTO1 = localCombinedRepository.getAll(timestamp);
                try {
                    if (timestamp == null || !timestamp.equals(localCombinedRepository.getLastTimeStamp())) {
                        localCombinedViewDTO1.forEach(this::processLocalCombinedViewAsync);
                        logger.info("Info Data retrieving from the client database table");
                    } else {
//                        System.exit(0);
                        logger.info("No recent data add in client database");
                    }
                } catch (Exception e) {
                    logger.error("An error occurred while processing data:", e.getMessage());
                }
            } catch (Exception e) {
                logger.error("error on Stored Procedure execution : ", e.getMessage());
            }
        } catch (Exception e) {
            logger.error("An error occurred while fetching or processing data : ", e.getMessage());
        }
    }

    public List<LocalCombinedViewDTO> all() {
        return localCombinedRepository.findAll();
    }

    private void saveAgentsToStore(AgentActivityDetails agentToStore) {
        try {
            agentToStoreRepository.save(agentToStore);
        } catch (Exception e) {
            logger.error("Error submitting tasks to executor service : ", e.getMessage());
        }
    }

    private void saveCustomersToStore(CustomerCallDetails customerToStore) {
        try {
            customerToStoreRepository.save(customerToStore);
        } catch (Exception e) {
            logger.error("Error submitting tasks to executor service : ", e.getMessage());
        }
    }

    private void saveOutBoundCallsToStore(OutBoundCalls outBoundCallToStoreList) {
        try {
            outBoundCallstoStoreRepository.save(outBoundCallToStoreList);
        } catch (Exception e) {
            logger.error("Error saving outbound calls to store : ", e.getMessage());
        }
    }

    private void processLocalCombinedViewAsync(LocalCombinedViewDTO localCombinedViewDTO) {
        logger.info("In process Local Combined View Async method");

        // Assuming localCombinedViewDTO is an instance of your DTO class

        try {
            Thread saveAgentsThread = new Thread(() -> {
                try {
                    AgentActivityDetails toSaveAgents = getAgentToStore(localCombinedViewDTO);
                    saveAgentsToStore(toSaveAgents);
                } catch (Exception e) {
                    logger.error("An error occurred while saving agents details: ", e.getMessage());
                }
            });

            Thread saveCustomersThread = new Thread(() -> {
                try {
                    CustomerCallDetails toSaveCustomer = getCustomerToStore(localCombinedViewDTO);
                    saveCustomersToStore(toSaveCustomer);
                } catch (Exception e) {
                    logger.error("An error occurred while saving customers details: ", e.getMessage());
                }
            });

            Thread saveOutBoundCallsThread = new Thread(() -> {
                try {
                    OutBoundCalls toSaveOut = getOutBoundCallToStore(localCombinedViewDTO);
                    saveOutBoundCallsToStore(toSaveOut);
                } catch (Exception e) {
                    logger.error("An error occurred while saving outbound calls details: ", e.getMessage());
                }
            });

            // Start the threads
            saveAgentsThread.start();
            saveCustomersThread.start();
            saveOutBoundCallsThread.start();

            // Wait for all threads to complete
            saveAgentsThread.join();
            saveCustomersThread.join();
            saveOutBoundCallsThread.join();


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Thread interrupted: ", e.getMessage());
        }
    }
}
