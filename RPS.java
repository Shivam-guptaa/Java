import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        Random R = new Random();
        System.out.println("ROCK , PAPER , SCISSOR");
        byte p =0;
        byte z = 0;
        while(z<5) {
            int a = R.nextInt(3);
            String c = null;
            switch (a) {
                case 1 -> c = "ROCK";
                case 2 -> c = "PAPER";
                case 0 -> c = "SCISSOR";
            }
            String b = S.next();
            b = b.toUpperCase();
            if (b.equals(c)) {
                System.out.println(c);
                System.out.println("Draw");
            } else if ((c.equals("ROCK") && b.equals("PAPER")) || (c.equals("PAPER") && b.equals("SCISSOR")) || (c.equals("SCISSOR") && b.equals("ROCK"))) {
                System.out.println(c);
                p++;
                System.out.println("You Won");
            } else if (b.equals("ROCK") || b.equals("PAPER") || b.equals("SCISSOR")) {
                System.out.println(c);
                System.out.println("You Lost");
                p--;
            } else {
                System.out.println("Wrong Choose");
            }
            z++;
        }
        System.out.println("Your point : "+p);

    }

}
