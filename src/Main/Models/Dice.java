package Main.Models;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int rollDice(int times){
        int count = 0;
        int result = 0;
        while (count < times) {
            result += (int) ((Math.random() * sides) + 1);
            count++;
        }
        return result;
    }

    public int rollDice(int times, int modifier){
        int count = 0;
        int result = 0;
        while (count < times) {
            result += (int) ((Math.random() * sides) + 1);
            count++;
        }
        return result + modifier;
    }
}
