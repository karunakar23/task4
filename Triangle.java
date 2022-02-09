package task4;
import java.util.Scanner;
public class Triangle {
    public static void fun(int a,int b,int c){
        if(a==b&&b==c) System.out.println("Equilateral Triangle");
        else if(a!=b&&b!=c&&a!=c) System.out.println("Scalene Triangle");
        else System.out.println("Isosceles Triangle");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value of a :");
        int a=scanner.nextInt();
        System.out.print("Enter the Value of b:");
        int b=scanner.nextInt();
        System.out.print("Enter the Value of c:");
        int c=scanner.nextInt();
        fun(a,b,c);
    }
}
