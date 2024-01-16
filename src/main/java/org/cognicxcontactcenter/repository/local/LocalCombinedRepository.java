package org.cognicxcontactcenter.repository.local;

import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface LocalCombinedRepository extends JpaRepository<LocalCombinedViewDTO, Integer> {

//    @Query("select l1_0.SLNO,l1_0.AgentGivenName,l1_0.AgentID,l1_0.AgentSurName,l1_0.BreakTime,l1_0.CallsAnswered,l1_0.CallsOffered,l1_0.SupervisorGivenName,l1_0.SupervisorLogin,l1_0.SupervisorSurName,l1_0.TenantID,l1_0.Timestamp,l1_1.QAScore,l1_2.HoldTime,l1_2.LoggedInTime,l1_2.NotReadyTime,l1_2.PostCallProcessingTime,l1_2.RingTime,l1_2.ShortCallsAnswered,l1_2.Site,l1_2.SiteID,l1_2.SupervisorUserID,l1_2.TalkTime,l1_2.Time,l1_2.UserID,l1_2.WaitingTime,l1_3.custID,l1_3.ApplicationID,l1_3.ApplicationName,l1_3.CcmID,l1_3.ContactSubType,l1_3.ContactType,l1_3.ContactTypeName,l1_3.GUID,l1_3.LastTreatmentID,l1_3.LastTreatmentStamp,l1_3.LastTreatmentTime,l1_3.LocalUserID,l1_3.Priority,l1_3.SequenceID,l1_3.SiteName,l1_3.SkillsetID,l1_3.SkillsetName,l1_3.Treatment,l1_4.AppAbandonDelay,l1_4.AppAcceptedDelay,l1_4.CallsConferenced,l1_4.CallsReturnToQ,l1_4.CallsReturnToQDueToTimeout,l1_4.ConsultTime,l1_4.ContactOriginatedStamp,l1_4.DisconnectSource,l1_4.FinalDisposition,l1_4.FinalDispositionInterval,l1_4.FinalDispositionStamp,l1_4.HandlingTime,l1_4.IdleTime,l1_4.InitialDisposition,l1_4.NumberOfTimesOnHold,l1_4.NumberOfTimesRTQ,l1_4.OriginatedInterval,l1_4.OriginatedStamp,l1_4.PresentingTime,l1_4.ServiceInterval,l1_4.SksAbandonDelay,l1_4.SksAcceptedDelay,l1_4.SupervisorID,l1_4.WaitTime from dbo.AgentActivityDetails1 l1_0 join OutboundCalls1 l1_1 on l1_0.SLNO=l1_1.SLNO join AgentActivityDetails2 l1_2 on l1_0.SLNO=l1_2.SLNO join CustomerCallDetails1 l1_3 on l1_0.SLNO=l1_3.SLNO join CustomerCallDetails2 l1_4 on l1_0.SLNO=l1_4.SLNO",)
//    @Query(value = "select l1_0.SLNO,l1_0.AgentGivenName,l1_0.AgentID,l1_0.AgentSurName,l1_0.BreakTime,l1_0.CallsAnswered" +
//            ",l1_0.CallsOffered,l1_0.SupervisorGivenName,l1_0.SupervisorLogin,l1_0.SupervisorSurName,l1_0.TenantID,l1_0.Timestamp,l1_1.QAScore,l1_2.HoldTime,l1_2.LoggedInTime,l1_2.NotReadyTime \n" +
//            ",l1_2.PostCallProcessingTime,l1_2.RingTime,l1_2.ShortCallsAnswered,l1_2.Site,l1_2.SiteID,l1_2.SupervisorUserID,l1_2.TalkTime,l1_2.Time,l1_2.UserID,l1_2.WaitingTime,l1_3.custID,l1_3.ApplicationID," +
//            "l1_3.ApplicationName,l1_3.CcmID,l1_3.ContactSubType,l1_3.ContactType,l1_3.ContactTypeName,l1_3.GUID,l1_3.LastTreatmentID,l1_3.LastTreatmentStamp,l1_3.LastTreatmentTime,l1_3.LocalUserID,l1_3.Priority,l1_3.SequenceID,l1_3.SiteName,l1_3.SkillsetID,l1_3.SkillsetName \n" +
//            ",l1_3.Treatment,l1_4.AppAbandonDelay,l1_4.AppAcceptedDelay,l1_4.CallsConferenced,l1_4.CallsReturnToQ,l1_4.CallsReturnToQDueToTimeout,l1_4.ConsultTime,l1_4.ContactOriginatedStamp,l1_4.DisconnectSource,l1_4.FinalDisposition,l1_4.FinalDispositionInterval,l1_4.FinalDispositionStamp,l1_4.HandlingTime,l1_4.IdleTime,l1_4.InitialDisposition \n" +
//            ",l1_4.NumberOfTimesOnHold,l1_4.NumberOfTimesRTQ,l1_4.OriginatedInterval,l1_4.OriginatedStamp,l1_4.PresentingTime,l1_4.ServiceInterval,l1_4.SksAbandonDelay,l1_4.SksAcceptedDelay,l1_4.SupervisorID,l1_4.WaitTime \n" +
//            "from dbo.AgentActivityDetails1 l1_0 \n" +
//            "join dbo.OutboundCalls1 l1_1 on l1_0.SLNO=l1_1.SLNO \n" +
//            "join dbo.AgentActivityDetails2 l1_2 on l1_0.SLNO=l1_2.SLNO \n" +
//            "join dbo.CustomerCallDetails1 l1_3 on l1_0.SLNO=l1_3.SLNO \n" +
//            "join dbo.CustomerCallDetails2 l1_4 on l1_0.SLNO=l1_4.SLNO\n" +
//            "where l1_0.Timestamp > ? ",nativeQuery = true)
//    List<LocalCombinedViewDTO> getAll(Timestamp timestamp);


    @Query(value = "exec GetAllRecordsFilteredWithJoins_example @LastProcessedTimestamp = :timestamp", nativeQuery = true)
    List<LocalCombinedViewDTO> getAll(@Param("timestamp") Timestamp timestamp);

    @Query(value = "SELECT TOP 1 MAX(timestamp) AS max_timestamp FROM AgentActivityDetails1 GROUP BY tenantID ORDER BY max_timestamp DESC",nativeQuery = true)
    Timestamp getLastTimeStamp();
}
