package fop.evgeniy.dmitriev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:config.properties")
public class SportConfig {

    @Bean
    public FortuneServices myHappyService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach mySwimCoach()  {
        return new SwimCoach(myHappyService());
    }

}
