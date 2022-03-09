package com.skillsoft.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainv2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarbeanConfig_v2.class);

        Car_v1 newcar = (Car_v1) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}