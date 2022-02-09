package task4;
import java.util.Scanner;
public class Marks {
    public static void fun(int a,int b,int c){
        System.out.println("Grade of Maths is :"+grade(a));
        System.out.println("Grade of Physics is :"+grade(b));
        System.out.println("Grade of Chemistry is :"+grade(c));
        System.out.println("Total Marks is :"+(a+b+c));
    }
    public static char grade(int x){
        if(x>=90) return 'A';
        else if(x>=80) return 'B';
        else if(x>=70) return 'C';
        else if(x>=60) return 'D';
        else return 'F';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Marks of Maths :");
        int a=scanner.nextInt();
        System.out.print("Enter the Marks of Physics :");
        int b=scanner.nextInt();
        System.out.print("Enter the Marks of Chemistry :");
        int c=scanner.nextInt();
        fun(a,b,c);
    }
}
