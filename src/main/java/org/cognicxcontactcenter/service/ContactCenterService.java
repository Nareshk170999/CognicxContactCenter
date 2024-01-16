package org.cognicxcontactcenter.service;

import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;

import java.sql.Timestamp;
import java.util.List;


public interface ContactCenterService {
    Timestamp getLastTimeStamp();
    void updateValues();
    List<LocalCombinedViewDTO> all();
}
