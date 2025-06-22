package Conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class greatestOfGivenNumber {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number = ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number = ");
        int b = sc.nextInt();
        System.out.println("Enter the Third number = ");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+"greatest number");
        } else if (b>=a && b>=c) {
            System.out.println(b+"greatest number");
        }
        else{
            System.out.println(c+" greatest number");
        }
    }
}
