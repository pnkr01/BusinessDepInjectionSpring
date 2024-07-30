package com.pawan.businessCalService.controller;

import com.pawan.businessCalService.model.DataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalController {
    private final DataService dataService;

    public BusinessCalController(@Qualifier("MySQLDataServiceQualifier") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
