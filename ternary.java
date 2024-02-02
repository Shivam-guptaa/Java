import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
   Scanner S = new Scanner(System.in);
   int n = S.nextInt();
   int m = S.nextInt();
   int x = (n>m)?(n-m):(m-n);
   System.out.println(x);
       
    }
}
