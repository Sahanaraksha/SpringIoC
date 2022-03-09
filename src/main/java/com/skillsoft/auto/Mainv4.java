package com.skillsoft.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainv4 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);

        Car2 newcar = (Car2) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
