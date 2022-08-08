package Main;

import Main.Models.Dice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int count = 0;
        Scanner scanner = new Scanner(System.in);
        // String roll = scanner.nextLine();
        while (count < 20) {
            System.out.println(roll("5d10")); // forma xd(4,6,8,10,12,100)
            //System.out.println(advantage());
            count++;

        }*/

        Dice d6 = new Dice(6);
        Dice d10 = new Dice(10);


        int count = 0;

        while (count < 20) {
            count++;
            System.out.println(d6.rollDice(2));
        }


    }

    public static int roll(String roll) {

        int count;
        int dice;
        try {
            count = Integer.parseInt(roll.split("d")[0]);
            dice = Integer.parseInt(roll.split("d")[1]);
        } catch (NumberFormatException e){
            e.printStackTrace();
            return 0;
        }


        int rolled = 0;
        int result = 0;
        switch (dice) {
            case 4 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 4) + 1);
                    rolled++;
                }
                return result;
            }
            case 6 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 6) + 1);
                    rolled++;
                }
                return result;
            }
            case 8 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 8) + 1);
                    rolled++;
                }
                return result;
            }
            case 10 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 10) + 1);
                    rolled++;
                }
                return result;
            }
            case 12 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 12) + 1);
                    rolled++;
                }
                return result;
            }
            case 100 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 100) + 1);
                    rolled++;
                }
                return result;
            }
            default -> {
                return result;
            }
        }
    }

    public static int rolld20() {
        return (int) ((Math.random() * 20) + 1);
    }

    public static int advantage() {
        int result1 = rolld20();
        int result2 = rolld20();

        if (result1 > result2) {
            System.out.println("The rolles are " + result1 + " and " + result2);
            return result1;
        } else {
            System.out.println("The rolles are " + result1 + " and " + result2);
            return result2;
        }
    }

    public static int disadvantage() {
        int result1 = rolld20();
        int result2 = rolld20();

        if (result1 < result2) {
            System.out.println("The rolles are " + result1 + " and " + result2);
            return result1;
        } else {
            System.out.println("The rolles are " + result1 + " and " + result2);
            return result2;
        }
    }

}
