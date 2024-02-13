package strategyPattern;

public class Wizard implements CharacterType{
    CastSpell castSpell = new CastSpell();
    ShieldBarrier shieldBarrier = new ShieldBarrier();

    @Override
    public String attack(){
        System.out.print("Wizard " + castSpell.attack());
        return null;
    }

    @Override
    public String defend(){
        System.out.print("Wizard " +  shieldBarrier.defend());
        return null;
    }

}