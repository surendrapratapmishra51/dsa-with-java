package patternPrinting;
import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
    }
}
