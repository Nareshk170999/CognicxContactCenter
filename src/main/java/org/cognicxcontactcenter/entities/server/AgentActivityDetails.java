
package org.cognicxcontactcenter.entities.server;



import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "agentsactivitydetails")
public class AgentActivityDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SLNO")
	private Integer slno;

	@Column(name = "TenantID")
	private Integer tenantID;
	@Column(name = "Timestamp")
	private Timestamp timestamp;

	@Column(name = "AgentID")
	private Integer agentID;

		@Column(name = "AgentSurName")
	private String agentSurName;

	@Column(name = "AgentGivenName")
	private String agentGivenName;

	@Column(name = "SupervisorLogin")
	private Integer supervisorLogin;

	@Column(name = "SupervisorSurName")
	private String supervisorSurName;

	@Column(name = "SupervisorGivenName")
	private String supervisorGivenName;

	@Column(name = "BreakTime")
	private Integer breakTime;

	@Column(name = "CallsAnswered")
	private Integer callsAnswered;

	@Column(name = "CallsOffered")
	private Integer callsOffered;

	@Column(name = "HoldTime")
	private Integer holdTime;

	@Column(name = "LoggedInTime")
	private Integer loggedInTime;

	@Column(name = "NotReadyTime")
	private Integer notReadyTime;

	@Column(name = "RingTime")
	private Integer ringTime;

	@Column(name = "ShortCallsAnswered")
	private Integer shortCallsAnswered;

	@Column(name = "TalkTime")
	private Integer talkTime;

	@Column(name = "WaitingTime")
	private String waitingTime;

	@Column(name = "UserID")
	private String userID;

	@Column(name = "SupervisorUserID")
	private String supervisorUserID;

	@Column(name = "Time")
	private Timestamp time;

	@Column(name = "SiteID")
	private String siteID;

	@Column(name = "Site")
	private String site;

	@Column(name = "PostCallProcessingTime")
	private String postCallProcessingTime;

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
}
