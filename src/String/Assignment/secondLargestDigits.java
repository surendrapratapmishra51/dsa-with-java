package String.Assignment;

import java.util.Scanner;

public class secondLargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String s = sc.nextLine();
        int n = s.length();

//        int max = Integer.MIN_VALUE;
//        int smax = Integer.MIN_VALUE;
        int max = -1;
        int smax = -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int x = Character.getNumericValue(c);
                if (x > max) {
                    smax = max;
                    max = x;
                } else if (x != max && x > smax) {
                    smax = x;

                }
            }

        }
        if (smax == -1) {
            System.out.println(" there is no second greatest number");
        } else {
            System.out.println("Second largest digit is:" + smax);
        }
    }
}
