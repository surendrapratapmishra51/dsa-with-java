package Assignment9;
import java.util.Scanner;
public class Que15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) {
            System.out.print(i);


        }
        System.out.println(" ");

        for (int i = 1; i <=n-1 ; i++) {
            int a = 1;            // for letter
            for (int j = 1; j <= n - i; j++) {
                System.out.print(a++);


            }


            for (int j = 1; j <= 2 * i-1; j++) {
                // for space
                System.out.print(" ");
                a++;
            }


            for (int j = 1; j <= n - i; j++) {
                System.out.print(a++);

      }
            System.out.println(" ");


    }
    }

}
