import java.util.Scanner;
public class IF {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subject out of 100 :");
        float a = S.nextFloat();
        float b = S.nextFloat();
        float c = S.nextFloat();
        if(a > 33 && b> 33 && c>33 && (a+b+c)/3>40){
            System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
    }
}
