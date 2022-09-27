package com.spring.code;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //creating array of Strings
    private String[] data ={
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"};
    // create a random method
    private Random random = new Random();

    @Override
    public String getFortune()
    {
        //pick a random String form the array
        int index =random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
