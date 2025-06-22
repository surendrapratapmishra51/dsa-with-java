package loops;
import java.util.*;
public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0; // prime number

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("composite number");
                x = 1;
                break;
            }
        }
            if (n == 1){
                System.out.println("neithe prime nor composite");
            } else if (x == 0) {
                System.out.println("prime number");

            }
        }
    }

