package com.skillsoft.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainv6 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarbeanConfig_v3.class);

        Car3 newcar = (Car3) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
