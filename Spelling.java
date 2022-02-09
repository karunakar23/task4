package task4;

import java.util.Scanner;

public class Spelling {
    public static void fun(int a){
        switch(a){
            case 1:{
                System.out.println("One");
                break;
            }
            case 2:{
                System.out.println("Two");
                break;
            }
            case 3:{
                System.out.println("Three");
                break;
            }
            case 4:{
                System.out.println("Four");
                break;
            }
            case 5:{
                System.out.println("Five");
                break;
            }
            case 6:{
                System.out.println("Six");
                break;
            }
            case 7:{
                System.out.println("Seven");
                break;
            }
            case 8:{
                System.out.println("Eight");
                break;
            }
            case 9:{
                System.out.println("Nine");
                break;
            }
            default:{
                System.out.println("Check the number");
            }
               

        }
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value of a :");
        int a = scanner.nextInt();
        fun(a);
    }
}
