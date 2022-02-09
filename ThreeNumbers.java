package task4;
import java.util.Scanner;
public class ThreeNumbers {
    public static void fun(int a,int b,int c){
        int large=(a>b)?a:b;
        System.out.println((large>c)?large:c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a :");
        int a=sc.nextInt();
        System.out.print("Enter value b :");
        int b=sc.nextInt();
        System.out.print("Enter value c :");
        int c=sc.nextInt();
        fun(a,b,c);
    }
}
