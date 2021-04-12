package com.learnreactivespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach  = context.getBean("myCoach",Coach.class);
        Coach TrackCoach  = context.getBean("TrackCoach",Coach.class);
        CricketCoach cricketCoach  = context.getBean("CricketCoach",CricketCoach.class);

        System.out.println("theCoach "+theCoach.getDailyWorkout());
        System.out.println("theCoach "+theCoach.getDailyFortune());
        System.out.println("theCoach "+theCoach.getDailyWorkout());

        System.out.println("TrackCoach "+TrackCoach.getDailyWorkout());
        System.out.println("theCoach "+TrackCoach.getDailyFortune());

        System.out.println("CricketCoach:"+cricketCoach.getTeam());

context.close();
    }
}
