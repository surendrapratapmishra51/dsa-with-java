package recursion.Assignment;

import java.util.Scanner;

public class positiveIntegerIsPowerOfOrNot {
    public static boolean isPower(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }

        if (n % 2 == 0) {
            return isPower(n / 2);
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        System.out.println(isPower(n));

    }
}
