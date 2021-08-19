package fop.evgeniy.dmitriev;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {

    @Value("${jay.name}")
    private String name;
    @Value("${jay.surname}")
    private String surname;
    private FortuneServices fortuneServices;

    public FootballCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String doWorkout() {
        return "Jog the football ball";
    }

    @Override
    public String getFortune() {
        return fortuneServices.getFortune();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "FootballCoach{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fortuneServices=" + fortuneServices +
                '}';
    }
}
