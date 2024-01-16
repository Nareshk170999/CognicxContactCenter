package org.cognicxcontactcenter.entities.server;


import jakarta.persistence.*;

import java.sql.Timestamp;



@Entity
@Table(name = "OutboundCalls", schema = "dbo")
public class OutBoundCalls {
    //    @Column(name = "TenantID",nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLNO")
    private Integer slno;
    private Integer tenantID;
    private Integer agentID;
    private Integer custID;
    private Integer sequenceID;
    private Integer contactType;
    private String contactTypeName;
    private String contactSubType;
    private String siteID;
    private String siteName;
    private String skillsetID;
    private String skillsetName;
    private String agentSurName;
    private String agentGivenName;
    private String supervisorSurName;
    private String supervisorGivenName;
    private String supervisorID;
    private Timestamp originatedStamp;
    private String initialDisposition;
    private String  handlingTime;
    private String consultTime;
    private Integer holdTime;
    private String waitTime;
    private String numberOfTimesOnHold;
    private Integer qaScore;

    public Integer getSlno() {
        return slno;
    }

    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public Integer getTenantID() {
        return tenantID;
    }

    public void setTenantID(Integer tenantID) {
        this.tenantID = tenantID;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
    }

    public Integer getSequenceID() {
        return sequenceID;
    }

    public void setSequenceID(Integer sequenceID) {
        this.sequenceID = sequenceID;
    }

    public Integer getContactType() {
        return contactType;
    }

    public void setContactType(Integer contactType) {
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

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
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

    public Integer getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getNumberOfTimesOnHold() {
        return numberOfTimesOnHold;
    }

    public void setNumberOfTimesOnHold(String numberOfTimesOnHold) {
        this.numberOfTimesOnHold = numberOfTimesOnHold;
    }

    public Integer getQaScore() {
        return qaScore;
    }

    public void setQaScore(Integer qaScore) {
        this.qaScore = qaScore;
    }
}
