package Assignment9;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Que19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();


        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {
                if(i+j==n+1||j-i==n-1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }

    }
}
