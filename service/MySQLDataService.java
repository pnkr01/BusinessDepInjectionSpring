package com.pawan.businessCalService.service;

import com.pawan.businessCalService.model.DataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{22,48,74,58,96,77,254};
    }
}
