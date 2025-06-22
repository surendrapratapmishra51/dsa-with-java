package patternPrinting.Revision;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.println("Enter the Number n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for (int j = 0; j <n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
