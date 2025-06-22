package patternPrinting;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows i = ");
        int n = sc.nextInt();
        System.out.println("Enter the number of column ");
        int m = sc.nextInt();
//        int n = 4;
//        int m = 4;

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
