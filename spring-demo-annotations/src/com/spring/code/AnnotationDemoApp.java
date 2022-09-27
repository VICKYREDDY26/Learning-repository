package com.spring.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from Spring Container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call a method on the bean
        System.out.println(theCoach.getWeeklyWorkout());

        //call a method on the bean
        System.out.println(theCoach.getDailyFortune()

        );

        context.close();

    }
}
