import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
//    Scanner S = new Scanner(System.in);
//    int n = S.nextInt();
//    int m = S.nextInt();
//    int x = (n>m)?(n-m):(m-n);
//    System.out.println(x);
        String names[] = {"Aditya","Shivam","Rahul","Sagar","Adi"};
        for(int i=0;i<names.length;i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }
    }
}
