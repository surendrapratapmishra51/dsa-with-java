package Assignment9;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the number =  ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j<=n-i; j++) {
           // for (int j = n-i; j >=1 ; j--) {

                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
