package strategyPattern;

public class IronShield implements DefenseStrategy{
    @Override
    public String defend(){
        return "using a shield to defend!";
    }

}