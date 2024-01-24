package org.cognicxcontactcenter.service;

import org.cognicxcontactcenter.entities.server.CustomerCallDetails;

import java.sql.Timestamp;
import java.util.List;


public interface ContactCenterService {
    Timestamp getLastTimeStamp();
    void updateValues();
}
