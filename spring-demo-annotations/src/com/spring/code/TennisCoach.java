package com.spring.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// you can use two types of component scan
//@Component(value ="theTennisCoach")
//@Component

@Component(value = "tennisCoach")
@Scope(value = "prototype")
public class TennisCoach implements Coach{

    //Creating Private FortuneService
    @Autowired
    //Qualifer no need to use any setter and Constructor methods
    @Qualifier(value ="randomFortuneService")
    private FortuneService theFortuneService;

    //    private FortuneService theFortuneService;

    //inside setter constructor
//    @Autowired
//    public void setTheFortuneService(FortuneService theFortuneService) {
//        System.out.println("inside the setter constructor");
//        this.theFortuneService = theFortuneService;
//    }

    //Creating constructor Injection
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        System.out.println("inside the setter constructor");
//        this.theFortuneService = theFortuneService;
//    }

    //use any method with autowired
//    @Autowired
//    public void youCanUseAnyName(FortuneService theFortuneService) {
//            System.out.println("inside the any_Name setter constructor");
//            this.theFortuneService = theFortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }

    @Override
    public String getWeeklyWorkout() {
        return "For the current week workout on shoulders";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }

}
