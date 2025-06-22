package advancePattern;
import java.util.*;
public class starTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <=n; i++) {

            // inner loop for upper sapace
            for (int j = 1; j <=nsp; j++) {
            System.out.print(" ");
        }
            for (int j = 1; j <=nst; j++) {
                // outer loop for star
                System.out.print("*");
            }
            nsp--;
            nst +=2;
            System.out.println(" ");
        }

        nsp = 1;
         nst = nst-4;
        for (int i = 1; i <=n-1; i++) {

            // inner loop for upper sapace
            for (int j = 1; j <=nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=nst; j++) {
                // outer loop for star
                System.out.print("*");
            }
            nsp++;
            nst -=2;
            System.out.println(" ");
        }


    }
}
