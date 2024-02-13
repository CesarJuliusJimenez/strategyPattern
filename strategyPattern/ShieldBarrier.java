package strategyPattern;

public class ShieldBarrier implements DefenseStrategy {
    @Override
    public String defend() {
        return "creating a magic barrier for defense!";
    }

}