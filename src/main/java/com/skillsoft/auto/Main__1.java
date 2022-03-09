package com.skillsoft.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main__1 {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Car1 newcar = (Car1) appContext.getBean("carBean");
        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
