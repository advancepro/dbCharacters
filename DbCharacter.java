package sample;

import java.util.stream.IntStream;

public class DbCharacter {

        int strength;
        int dexterity;
        int constitution;
        int intelligence;
        int charisma;
        int wisdom;
        int hitpoints;

        DbCharacter(){
            strength = ability();
            dexterity = ability();
            constitution = ability();
            intelligence = ability();
            charisma = ability();
            wisdom = ability();
            hitpoints = 10 + modifier(getConstitution());
        }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
    private int rollDice() {
        return (int) (Math.floor(6 * Math.random()) + 1);
    }
    public int ability() {
        return IntStream.range(0, 4).map(x -> rollDice()).sorted().limit(3).sum();
    }
    public int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }


}
