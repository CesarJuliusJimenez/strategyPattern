package strategyPattern;

public class GameApp {

    public static void main(String[] args) {

        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        // Knight Class
        knight.attack();
        System.out.println();
        knight.defend();
        System.out.println();

        // Wizard Class
        wizard.attack();
        System.out.println();
        wizard.defend();
        System.out.println();

        // Archer Class
        archer.attack();
        System.out.println();
        archer.defend();

    }

}