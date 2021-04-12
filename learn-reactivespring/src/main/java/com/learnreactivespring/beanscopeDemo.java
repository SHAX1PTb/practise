package com.learnreactivespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanscopeDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

        Coach coach = context.getBean("myCoach",Coach.class);
        Coach coach2 = context.getBean("myCoach",Coach.class);
        TrackCoach trackCoach = context.getBean("TrackCoach",TrackCoach.class);

        boolean result = (coach == coach2);
        System.out.println("\nPointing to same object :"+result);
        System.out.println("\nMemory location for Coach:"+coach.toString());
        System.out.println("\nMemory location for TRackCoach:"+coach2.toString());

        context.close();
    }
}
