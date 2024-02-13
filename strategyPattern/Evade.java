package strategyPattern;

public class Evade implements DefenseStrategy {
    @Override
    public String defend(){
        return "dodging to avoid attack!";
    }

}