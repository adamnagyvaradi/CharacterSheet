package Main;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        while (count < 20) {
            System.out.println(roll("1d8"));
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
                while (rolled < count) {
                    result = (int) ((Math.random() * 20) + 1);
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
        }
        return result;
    }
}
