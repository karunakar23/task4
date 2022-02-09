package task4;
import java.util.Scanner;
public class Cordinates {
    public static void fun(int a,int b){
    if (a > 0 && b > 0) System.out.println("lies in Fourth quadrant");
    else if (a < 0 && b > 0) System.out.println("lies in First quadrant");
    else if (a < 0 && b < 0) System.out.println("lies in Second quadrant");
    else if (a > 0 && b < 0) System.out.println("lies in a Third quadrant");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=scanner.nextInt();
        System.out.print("Enter the value of b :");
        int b=scanner.nextInt();
        fun(a,b);
    }
    
}
