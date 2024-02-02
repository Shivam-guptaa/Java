import java.util.Scanner;

public class percentage {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);

        System.out.println("Enter the marks of all 5 subject out of 100: ");
        byte a = A.nextByte();
        byte b = A.nextByte();
        byte c = A.nextByte();
        byte d = A.nextByte();
        byte e = A.nextByte();
        float x = a+b+c+d+e ;
        x = x/5;
        System.out.println("Percentage : "+x);
//          System.out.print("Enter a number :");
//          String a = A.nextLine();
//          System.out.print("How are you ?? Mr. "+a);
    }
}
