//package GGk;
//
//import java.util.Scanner;
//
//public class factorial {
//    public static int fact(int n){
//        if(n<i) {
//            return 1;
//        }
//        int ans = n*fact(n+1);
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" n = ");
//        int n = sc.nextInt();
//        for(int i = 0; i<=5; i++) {
//            System.out.println(fact(i));
//        }
//    }
//}
import java.util.Scanner;

public class factorial {
    // Method to calculate factorial of a number
    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;

            if (fact < number);
        }
            return fact;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Factorials from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}