import java.util.Scanner;
public class ARRay {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        float[] marks = new float[5];
        float x = 0;
        System.out.println("Enter 5 value :");
        float n;
        for(int i=0;i<5;i++){
            n = S.nextFloat();
            marks[i] = n;
        }
        for(float element : marks){
            x += element;
        }
        System.out.println(marks.length*60);
    System.out.println(x);
//        int[][] flat =  {{0,1,6},{2,6,7}};
//        int[][] flat2 = {{6,7,9},{5,67,6}};

    }
}
