package org.cognicxcontactcenter.entities.local;





import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class LocalCombinedViewDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLNO")
    private Integer slno;
    private Integer tenantID;
    private Timestamp timestamp;
    private Integer agentID;
    private String agentSurName;
    private String agentGivenName;
    private Integer supervisorLogin;
    private String supervisorSurName;
    private String supervisorGivenName;
    private Integer breakTime;
    private Integer callsAnswered;
    private Integer callsOffered;
    private Integer holdTime;
    private Integer loggedInTime;
    private Integer notReadyTime;
    private Integer ringTime;
    private Integer shortCallsAnswered;
    private Integer talkTime;
    private String waitingTime;
    private String userID;
    private String supervisorUserID;
    private Timestamp time;
    private String siteID;
    private String site;
    private String postCallProcessingTime;
    private Integer custID;
    private String sequenceID;
    private String guid;
    private String ccmID;
    private String contactType;
    private String contactTypeName;
    private String contactSubType;
    private String priority;
    private String siteName;
    private String applicationID;
    private String applicationName;
    private String lastTreatmentID;
    private String treatment;
    private Timestamp lastTreatmentStamp;
    private String lastTreatmentTime;
    private String skillsetID;
    private String skillsetName;
    private String localUserID;
    private String supervisorID;
    private Timestamp originatedStamp;
    private String initialDisposition;
    private Timestamp appAbandonDelay;
    private String appAcceptedDelay;
    private String sksAbandonDelay;
    private String  sksAcceptedDelay;
    private String handlingTime;
    private String consultTime;
    private String numberOfTimesOnHold;
    private String  numberOfTimesRTQ;
    private String finalDisposition;
    private Timestamp finalDispositionStamp;
    private String presentingTime;
    private String  waitTime;
    private Timestamp contactOriginatedStamp;
    private Timestamp finalDispositionInterval;
    private Timestamp serviceInterval;
    private Timestamp originatedInterval;
    private String disconnectSource;
    private String  callsConferenced;
    private String callsReturnToQ;
    private String  callsReturnToQDueToTimeout;
    private String idleTime;
    private Integer qaScore;

    public Integer getTenantID() {
        return tenantID;
    }

    public void setTenantID(Integer tenantID) {
        this.tenantID = tenantID;
    }

    public Integer getSlno() {
        return slno;
    }

    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public String getAgentSurName() {
        return agentSurName;
    }

    public void setAgentSurName(String agentSurName) {
        this.agentSurName = agentSurName;
    }

    public String getAgentGivenName() {
        return agentGivenName;
    }

    public void setAgentGivenName(String agentGivenName) {
        this.agentGivenName = agentGivenName;
    }

    public Integer getSupervisorLogin() {
        return supervisorLogin;
    }

    public void setSupervisorLogin(Integer supervisorLogin) {
        this.supervisorLogin = supervisorLogin;
    }

    public String getSupervisorSurName() {
        return supervisorSurName;
    }

    public void setSupervisorSurName(String supervisorSurName) {
        this.supervisorSurName = supervisorSurName;
    }

    public String getSupervisorGivenName() {
        return supervisorGivenName;
    }

    public void setSupervisorGivenName(String supervisorGivenName) {
        this.supervisorGivenName = supervisorGivenName;
    }

    public Integer getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(Integer breakTime) {
        this.breakTime = breakTime;
    }

    public Integer getCallsAnswered() {
        return callsAnswered;
    }

    public void setCallsAnswered(Integer callsAnswered) {
        this.callsAnswered = callsAnswered;
    }

    public Integer getCallsOffered() {
        return callsOffered;
    }

    public void setCallsOffered(Integer callsOffered) {
        this.callsOffered = callsOffered;
    }

    public Integer getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
    }

    public Integer getLoggedInTime() {
        return loggedInTime;
    }

    public void setLoggedInTime(Integer loggedInTime) {
        this.loggedInTime = loggedInTime;
    }

    public Integer getNotReadyTime() {
        return notReadyTime;
    }

    public void setNotReadyTime(Integer notReadyTime) {
        this.notReadyTime = notReadyTime;
    }

    public Integer getRingTime() {
        return ringTime;
    }

    public void setRingTime(Integer ringTime) {
        this.ringTime = ringTime;
    }

    public Integer getShortCallsAnswered() {
        return shortCallsAnswered;
    }

    public void setShortCallsAnswered(Integer shortCallsAnswered) {
        this.shortCallsAnswered = shortCallsAnswered;
    }

    public Integer getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(Integer talkTime) {
        this.talkTime = talkTime;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSupervisorUserID() {
        return supervisorUserID;
    }

    public void setSupervisorUserID(String supervisorUserID) {
        this.supervisorUserID = supervisorUserID;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPostCallProcessingTime() {
        return postCallProcessingTime;
    }

    public void setPostCallProcessingTime(String postCallProcessingTime) {
        this.postCallProcessingTime = postCallProcessingTime;
    }

    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
    }

    public String getSequenceID() {
        return sequenceID;
    }

    public void setSequenceID(String sequenceID) {
        this.sequenceID = sequenceID;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getCcmID() {
        return ccmID;
    }

    public void setCcmID(String ccmID) {
        this.ccmID = ccmID;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactTypeName() {
        return contactTypeName;
    }

    public void setContactTypeName(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }

    public String getContactSubType() {
        return contactSubType;
    }

    public void setContactSubType(String contactSubType) {
        this.contactSubType = contactSubType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getLastTreatmentID() {
        return lastTreatmentID;
    }

    public void setLastTreatmentID(String lastTreatmentID) {
        this.lastTreatmentID = lastTreatmentID;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Timestamp getLastTreatmentStamp() {
        return lastTreatmentStamp;
    }

    public void setLastTreatmentStamp(Timestamp lastTreatmentStamp) {
        this.lastTreatmentStamp = lastTreatmentStamp;
    }

    public String getLastTreatmentTime() {
        return lastTreatmentTime;
    }

    public void setLastTreatmentTime(String lastTreatmentTime) {
        this.lastTreatmentTime = lastTreatmentTime;
    }

    public String getSkillsetID() {
        return skillsetID;
    }

    public void setSkillsetID(String skillsetID) {
        this.skillsetID = skillsetID;
    }

    public String getSkillsetName() {
        return skillsetName;
    }

    public void setSkillsetName(String skillsetName) {
        this.skillsetName = skillsetName;
    }

    public String getLocalUserID() {
        return localUserID;
    }

    public void setLocalUserID(String localUserID) {
        this.localUserID = localUserID;
    }

    public String getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(String supervisorID) {
        this.supervisorID = supervisorID;
    }

    public Timestamp getOriginatedStamp() {
        return originatedStamp;
    }

    public void setOriginatedStamp(Timestamp originatedStamp) {
        this.originatedStamp = originatedStamp;
    }

    public String getInitialDisposition() {
        return initialDisposition;
    }

    public void setInitialDisposition(String initialDisposition) {
        this.initialDisposition = initialDisposition;
    }

    public Timestamp getAppAbandonDelay() {
        return appAbandonDelay;
    }

    public void setAppAbandonDelay(Timestamp appAbandonDelay) {
        this.appAbandonDelay = appAbandonDelay;
    }

    public String getAppAcceptedDelay() {
        return appAcceptedDelay;
    }

    public void setAppAcceptedDelay(String appAcceptedDelay) {
        this.appAcceptedDelay = appAcceptedDelay;
    }

    public String getSksAbandonDelay() {
        return sksAbandonDelay;
    }

    public void setSksAbandonDelay(String sksAbandonDelay) {
        this.sksAbandonDelay = sksAbandonDelay;
    }

    public String getSksAcceptedDelay() {
        return sksAcceptedDelay;
    }

    public void setSksAcceptedDelay(String sksAcceptedDelay) {
        this.sksAcceptedDelay = sksAcceptedDelay;
    }

    public String getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(String handlingTime) {
        this.handlingTime = handlingTime;
    }

    public String getConsultTime() {
        return consultTime;
    }

    public void setConsultTime(String consultTime) {
        this.consultTime = consultTime;
    }

    public String getNumberOfTimesOnHold() {
        return numberOfTimesOnHold;
    }

    public void setNumberOfTimesOnHold(String numberOfTimesOnHold) {
        this.numberOfTimesOnHold = numberOfTimesOnHold;
    }

    public String getNumberOfTimesRTQ() {
        return numberOfTimesRTQ;
    }

    public void setNumberOfTimesRTQ(String numberOfTimesRTQ) {
        this.numberOfTimesRTQ = numberOfTimesRTQ;
    }

    public String getFinalDisposition() {
        return finalDisposition;
    }

    public void setFinalDisposition(String finalDisposition) {
        this.finalDisposition = finalDisposition;
    }

    public Timestamp getFinalDispositionStamp() {
        return finalDispositionStamp;
    }

    public void setFinalDispositionStamp(Timestamp finalDispositionStamp) {
        this.finalDispositionStamp = finalDispositionStamp;
    }

    public String getPresentingTime() {
        return presentingTime;
    }

    public void setPresentingTime(String presentingTime) {
        this.presentingTime = presentingTime;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public Timestamp getContactOriginatedStamp() {
        return contactOriginatedStamp;
    }

    public void setContactOriginatedStamp(Timestamp contactOriginatedStamp) {
        this.contactOriginatedStamp = contactOriginatedStamp;
    }

    public Timestamp getFinalDispositionInterval() {
        return finalDispositionInterval;
    }

    public void setFinalDispositionInterval(Timestamp finalDispositionInterval) {
        this.finalDispositionInterval = finalDispositionInterval;
    }

    public Timestamp getServiceInterval() {
        return serviceInterval;
    }

    public void setServiceInterval(Timestamp serviceInterval) {
        this.serviceInterval = serviceInterval;
    }

    public Timestamp getOriginatedInterval() {
        return originatedInterval;
    }

    public void setOriginatedInterval(Timestamp originatedInterval) {
        this.originatedInterval = originatedInterval;
    }

    public String getDisconnectSource() {
        return disconnectSource;
    }

    public void setDisconnectSource(String disconnectSource) {
        this.disconnectSource = disconnectSource;
    }

    public String getCallsConferenced() {
        return callsConferenced;
    }

    public void setCallsConferenced(String callsConferenced) {
        this.callsConferenced = callsConferenced;
    }

    public String getCallsReturnToQ() {
        return callsReturnToQ;
    }

    public void setCallsReturnToQ(String callsReturnToQ) {
        this.callsReturnToQ = callsReturnToQ;
    }

    public String getCallsReturnToQDueToTimeout() {
        return callsReturnToQDueToTimeout;
    }

    public void setCallsReturnToQDueToTimeout(String callsReturnToQDueToTimeout) {
        this.callsReturnToQDueToTimeout = callsReturnToQDueToTimeout;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    public Integer getQaScore() {
        return qaScore;
    }

    public void setQaScore(Integer qaScore) {
        this.qaScore = qaScore;
    }
}
