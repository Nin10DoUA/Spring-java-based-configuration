package fop.evgeniy.dmitriev;

public class HappyFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "My Happy Fortune!";
    }
}
