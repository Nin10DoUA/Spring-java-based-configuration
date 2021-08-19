package fop.evgeniy.dmitriev;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${jay.email}")
    private String email;
    @Value("${jay.team}")
    private String team;

    private FortuneServices myHappyService;


    public SwimCoach(FortuneServices myHappyService) {
        this.myHappyService = myHappyService;
    }

    @Override
    public String doWorkout() {
        return "Swim-Swim-Swim!!!!";
    }

    @Override
    public String getFortune() {
        return myHappyService.getFortune();
    }

    @Override
    public String toString() {
        return "SwimCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                ", myHappyService=" + myHappyService +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
