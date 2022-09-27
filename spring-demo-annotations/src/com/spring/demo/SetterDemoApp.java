package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args)
    {
     // load the spring configuration file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
     // retrieve bean from spring container
        CricketCoach cricket_coach = context.getBean("myCricketCoach",CricketCoach.class);

     // call methods on the bean
        System.out.println(cricket_coach.getDailyWorkout());
        System.out.println(cricket_coach.getDailyFortune());

        System.out.println(cricket_coach.getEmailAddress());
        System.out.println(cricket_coach.getTeamName());
        // close the context
        context.close();
    }
}
