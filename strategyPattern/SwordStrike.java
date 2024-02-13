package strategyPattern;

public class SwordStrike implements AttackStrategy {
    @Override
    public String attack(){
        return "attacks with a sword!";
    }

}