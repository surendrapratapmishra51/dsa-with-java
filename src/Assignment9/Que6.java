package Assignment9;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n= sc.nextInt();
        int m= sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if( i==1|| i==n||j==1|| j==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println(" ");
        }

    }
}
