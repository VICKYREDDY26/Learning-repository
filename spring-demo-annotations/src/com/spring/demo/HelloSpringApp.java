package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                                                    ("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("beanRetriever", Coach.class);

        // retrieve bean from spring container
        Coach theCoach_Two = context.getBean("beanRetriever_Two", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call methods on the bean
        System.out.println(theCoach.getDailyFortune());


        // call methods on the bean
        System.out.println(theCoach_Two.getDailyWorkout());

        System.out.println(theCoach_Two.getDailyFortune());

        // close the context
        context.close();
    }
}
