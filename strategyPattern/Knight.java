package strategyPattern;

public class Knight implements CharacterType{
    SwordStrike swordStrike = new SwordStrike();
    IronShield ironShield = new IronShield();
    Evade evade = new Evade();
    ShieldBarrier shieldBarrier = new ShieldBarrier();

    @Override
    public String attack(){
        System.out.print("Knight " + swordStrike.attack());
        return null;
    }

    @Override
    public String defend(){
        System.out.print(ironShield.defend() + "\n" + evade.defend() + "\n" + shieldBarrier.defend());
        return null;
    }

}