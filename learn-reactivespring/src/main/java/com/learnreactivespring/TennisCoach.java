package com.learnreactivespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach{

//    @Autowired
//    public TennisCoach(FortuneService thefortuneService) {
//        this.fortuneService = thefortuneService;
//    }

//    @Autowired
//    public void  doSomeCrazyStuff(FortuneService fortuneService){
//        System.out.println("crazy Method");
//        System.out.println("inside doSomeCrazyStuff");
//        this.fortuneService = fortuneService;
//    }

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practise backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
