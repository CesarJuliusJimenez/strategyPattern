package strategyPattern;

public class Character {
    private CharacterType charType;

    public Character(CharacterType charType) {
        this.charType = charType;
    }

    public String attack(){
        return charType.attack();
    }

    public String defend(){
        return charType.defend();
    }

}