package Stroy_Based_Question;

import java.util.Scanner;

public class Monkey_banana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of monkey n = ");
        int n = sc.nextInt();
        System.out.println("Total number of Banana m = ");
        int m = sc.nextInt();
        System.out.println("Total number of Peanut p = ");
        int p = sc.nextInt();
        System.out.println("Monkey eat banana = ");
        int k = sc.nextInt();
        System.out.println("Monkey eat peanuts");
        int j = sc.nextInt();

        int Monkey_banana_eat = m/k;
        int rem_banana = m%k;

        int Monkey_peanuts_eat = p/j;
        int rem_peanuts = p%j;
        int left_monkey = 0;
        if(rem_banana != 0 || rem_peanuts != 0){
             left_monkey = n-(Monkey_banana_eat + Monkey_peanuts_eat+1);
        }
        else{
             left_monkey = n-(Monkey_banana_eat+Monkey_peanuts_eat);
        }
        System.out.println(left_monkey);

    }
}
