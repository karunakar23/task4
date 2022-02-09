package task4;
import java.util.Scanner;
public class Digital {
    public static void fun(int m){
        if(m>0) System.out.println("The value of n is "+1);
        else if(m==0) System.out.println("The value of n is "+0);
        else System.out.println("The value of n is "+-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value Of m ");
        int m=scanner.nextInt();
        fun(m);
    }
}
