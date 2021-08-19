package fop.evgeniy.dmitriev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class FootballCoachConfig {

    @Bean
    public FortuneServices myRandomFortune()    {
        return new RandomFortune();
    }

    @Bean
    public Coach myFootballCoach()  {
        return new FootballCoach(myRandomFortune());
    }

}
