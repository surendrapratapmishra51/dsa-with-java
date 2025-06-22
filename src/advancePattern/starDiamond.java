package advancePattern;
import java.util.*;
public class starDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                // inner loop for spaces

                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                // outer loop for star
                System.out.print("*");

            }

            System.out.println(" ");
        }
    }
}
