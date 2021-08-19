package fop.evgeniy.dmitriev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class, FootballCoachConfig.class);
        SwimCoach coach = context.getBean("mySwimCoach", SwimCoach.class);
        System.out.println(coach.doWorkout());
        System.out.println(coach.getFortune());
        System.out.println(coach.toString());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        FootballCoach footCoach = context.getBean("myFootballCoach", FootballCoach.class);
        System.out.println(footCoach.doWorkout());
        System.out.println(footCoach.getFortune());
        System.out.println(footCoach.toString());
        System.out.println(footCoach.getName());
        System.out.println(footCoach.getSurname());

    }
}
