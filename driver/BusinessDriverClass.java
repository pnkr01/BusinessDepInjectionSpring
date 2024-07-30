package com.pawan.businessCalService.driver;

import com.pawan.businessCalService.controller.BusinessCalController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ComponentScan("com.pawan.businessCalService.service")
@ComponentScan("com.pawan.businessCalService.controller")
public class BusinessDriverClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BusinessDriverClass.class
        );

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        System.out.println("max is"+context.getBean(BusinessCalController.class).findMax());
    }
}
