package strategyPattern;

public class PiercingArrow implements AttackStrategy{
    @Override
    public String attack(){
        return "shoots an arrow!";
    }

}