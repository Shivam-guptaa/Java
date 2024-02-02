import java.util.Scanner;
public class sWithCh {
    public static void main(String[] args){
        System.out.println("Enter the month no. :");
        Scanner S = new Scanner(System.in);
        byte s = S.nextByte();
        switch (s){
            case 1 -> {System.out.print("January");
                    System.out.print("Happy new Year !!!!!");
            }
            case 2 -> System.out.print("Feburary");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
            default -> System.out.print("Wrong number");
        }
    }
}
