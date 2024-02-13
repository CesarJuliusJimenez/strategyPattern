## Problem
Suppose we have three types of characters in a GameApp:

Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
Wizard: Casts spells; uses magic barrier to defend
Archer: Shoots arrows; uses dodge to to defend
Implement two types of Strategy:

DefenseStrategy
Shield
Dodge
CreateMagic
AttackStrategy
CastSpell
ShootArrow
SwingSword
Refactor the existing codes and provide the UML Diagram:

<pre>
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
            System.out.println("Dodging to avoid attack!");
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!");
        }
    }
}
</pre>

## UML Diagram
![Assigment 1 (10)](https://github.com/CesarJuliusJimenez/strategyPattern/assets/116608904/0c72e044-fb31-476a-a482-606c16a43fe2)
