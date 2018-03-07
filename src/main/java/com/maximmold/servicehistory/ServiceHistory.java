package com.maximmold.servicehistory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxmoldenhauer on 3/6/18.
 */
public class ServiceHistory {
    private Long fileNumber;
    private List<ServicePeriod> servicePeriodList;

    public Long getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Long fileNumber) {
        this.fileNumber = fileNumber;
    }

    public List<ServicePeriod> getServicePeriodList() {
        if (servicePeriodList == null) {
            servicePeriodList = new ArrayList<>();
        }
        return servicePeriodList;
    }

    public void setServicePeriodList(List<ServicePeriod> servicePeriodList) {
        this.servicePeriodList = servicePeriodList;
    }
}
