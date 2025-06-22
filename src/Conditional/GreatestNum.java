package Conditional;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the first number");
        int b = sc.nextInt();
        System.out.println("Enter the first number");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else {
                System.out.println("c is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is grearer");
            }
        }
    }
}
