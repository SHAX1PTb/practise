package com.learnreactivespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beansLifeCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");

        Coach coach = context.getBean("TrackCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
