package com.skillsoft.auto;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext21.xml");
        Car car = (Car) appContext.getBean("carBean");
        System.out.println("The car obtained from the Bean:\n" + car);
    }
}