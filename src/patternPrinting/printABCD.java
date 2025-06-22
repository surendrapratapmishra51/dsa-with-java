package patternPrinting;

import java.util.Scanner;

public class printABCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        char n = sc.next().charAt(0);

        for (char i = 65; i <=n; i++) {

            for (char j = 65; j <=n; j++) {
                System.out.print(j+" ");

            }

            System.out.println(" ");
        }
    }
}
