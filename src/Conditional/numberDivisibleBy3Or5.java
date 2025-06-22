package Conditional;

import java.util.Scanner;

public class numberDivisibleBy3Or5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if(num % 5 == 0 || num % 3 == 0){
            System.out.println(num+" is divisible by 3 or 5");
        }
    }
}
