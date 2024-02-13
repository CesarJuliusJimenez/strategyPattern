package strategyPattern;

public class Archer implements CharacterType{
    PiercingArrow piercingArrow = new PiercingArrow();
    IronShield ironShield = new IronShield();

    @Override
    public String attack(){
        System.out.print("Archer " + piercingArrow.attack());
        return null;
    }

    @Override
    public String defend(){
        System.out.print("Archer " + ironShield.defend());
        return null;
    }

}