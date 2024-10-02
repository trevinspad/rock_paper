import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner; // import the Scanner class

import static java.lang.System.in;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(in);
        int player1;

        System.out.println(" type one of 0 = rock 1 = paper 2 = scissors 3 = lizard 4 = Spock");
        player1 = Integer.parseInt(myObj.nextLine());
        if (player1 < 0 || player1 > 4) {
            System.out.println("invalid chose");
            return ;
        }
        int botpick;
        do {
            botpick = new Random().nextInt(4);
        } while (Arrays.asList(in).contains(botpick));
        System.out.println(botpick + " bot picked ");
        if (Objects.equals(player1, String.valueOf(botpick))) {

            System.out.println("tie");
        }
        if (player1 == 0) {
            if (botpick == 1 || botpick == 3) {
                System.out.println("bot wins");
            }
            if (botpick == 2 || botpick == 4) {
                System.out.println("player wins");
            }
        }
        if (player1 == 1) {
            if (botpick == 2 || botpick == 4) {
                System.out.println("bot wins");
            }
            if (botpick == 3 || botpick == 0) {
                System.out.println("player wins");
            }
        }
        if (player1 == 2) {
            if (botpick == 1 || botpick == 3) {
                System.out.println("bot wins");
            }
            if (botpick == 0 || botpick == 4) {
                System.out.println("player wins");
            }
        }
        if (player1 == 3) {
            if (botpick == 1 || botpick == 0) {
                System.out.println("bot wins");
            }
            if (botpick == 2 || botpick == 4) {
                System.out.println("player wins");
            }
        }
        if (player1 == 4) {
            if (botpick == 1 || botpick == 3) {
                System.out.println("bot wins");
            }
            if (botpick == 0 || botpick == 0) {
                System.out.println("player wins");
            }
        }
    }
}

