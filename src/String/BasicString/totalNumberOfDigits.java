package String.BasicString;

import java.util.Scanner;

public class totalNumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int number = sc.nextInt();

        // convert the number into string
        String NumberString = Integer.toString(number);

        int DigitsOfNumber = NumberString.length();
        System.out.println("Total number of digits = "+DigitsOfNumber);

    }
}
