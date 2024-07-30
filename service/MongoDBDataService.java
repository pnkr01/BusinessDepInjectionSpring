package com.pawan.businessCalService.service;

import com.pawan.businessCalService.model.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5,6};
    }
}
