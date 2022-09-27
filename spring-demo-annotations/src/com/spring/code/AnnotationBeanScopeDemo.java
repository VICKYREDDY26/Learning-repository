package com.spring.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

    public static void main(String[] args) {


        //reading the configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve the bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //retrieve the bean
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (alphaCoach == theCoach);

        System.out.println("the result :" + result);
        System.out.println("the bean in theCoach :"+ theCoach);
        System.out.println("the bean in alphaCoach :"+ alphaCoach);
        context.close();
    }
}

