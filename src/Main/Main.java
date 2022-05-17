package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String roll = scanner.nextLine();
        while (count < 20) {
            // System.out.println(roll(roll)); // forma xd(4,6,8,10,12,20,100)
            System.out.println(rolld20(roll));
            count++;

        }

    }

    public static int roll(String roll) {

        int count = Integer.parseInt(roll.split("d")[0]);
        int dice = Integer.parseInt(roll.split("d")[1]);

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
            case 20 -> {
                return (int) ((Math.random() * 20) + 1);
            }
            case 100 -> {
                while (rolled < count) {
                    result += (int) ((Math.random() * 100) + 1);
                    rolled++;
                }
                return result;
            }
        }
        return result;
    }

    public static int rolld20(){
        return (int) ((Math.random() * 20) + 1);
    }

    public static int rolld20(String status){
        int result1 = (int) ((Math.random() * 20) + 1);
        int result2 = (int) ((Math.random() * 20) + 1);

        if (status.equalsIgnoreCase("a")){
                        if (result1 >= result2){
                System.out.println("The rolles are " + result1 + " and "  + result2);
                return result1;
            } else {
                            System.out.println("The rolles are " + result1 + " and "  + result2);
                return result2;
            }
        } else if (status.equalsIgnoreCase("d")){
            if (result1 <= result2){
                System.out.println("The rolles are " + result1 + " and "  + result2);
                return result1;
            } else {
                System.out.println("The rolles are " + result1 + " and "  + result2);
                return result2;
            }
        } else {
            return (int) ((Math.random() * 20) + 1);
        }
    }
}
