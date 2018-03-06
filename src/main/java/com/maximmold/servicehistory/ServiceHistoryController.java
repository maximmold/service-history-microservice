package com.maximmold.servicehistory;

import io.github.benas.randombeans.api.EnhancedRandom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ServiceHistoryController {

    private Map<Long, ServiceHistory> serviceHistoryHashMap = new ConcurrentHashMap<>();
    
    @RequestMapping("serviceHistory")
    public ServiceHistory serviceHistory(Long fileNumber){
        ServiceHistory serviceHistory = serviceHistoryHashMap.get(fileNumber);
        if (serviceHistory != null) {
            serviceHistory = EnhancedRandom.random(ServiceHistory.class);
            serviceHistoryHashMap.putIfAbsent(fileNumber, serviceHistory);   
        }
        return serviceHistory;
    }
}