package task4;
import java.util.Scanner;
public class LeapYear {
    public static boolean fun(int year){
        return ((year%4==0)&&(year%100!=0))||((year%100==0)&&(year%400==0));
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Year :");
       int year=sc.nextInt();
       System.out.println(fun(year));
   } 
}
