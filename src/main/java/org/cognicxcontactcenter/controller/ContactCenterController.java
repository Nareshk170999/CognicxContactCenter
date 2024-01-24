package org.cognicxcontactcenter.controller;


import org.cognicxcontactcenter.entities.local.LocalCombinedViewDTO;
import org.cognicxcontactcenter.entities.server.CustomerCallDetails;
import org.cognicxcontactcenter.service.ContactCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("api")
public class ContactCenterController {
    private final Logger logger = LoggerFactory.getLogger(ContactCenterController.class);
    private final ContactCenterService contactCenterService;
    public ContactCenterController(ContactCenterService contactCenterService) {
        this.contactCenterService = contactCenterService;
    }
    @GetMapping("time")
    public Timestamp getTime() {
        return contactCenterService.getLastTimeStamp();
    }
    @Scheduled(cron = "*/10 * * * * *")
    @PostMapping("/updateValues")
    public void updateValues() {
        contactCenterService.updateValues();
        logger.info("An Insert or Update method invoked");
    }
}
