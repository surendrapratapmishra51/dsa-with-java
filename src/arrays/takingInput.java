package arrays;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        int[]userArray = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter element for index "+ i + ":");
            userArray[i] = sc.nextInt();

        }
        System.out.print("\nArray element: ");
        for (int i = 0; i <size; i++) {
            System.out.print(userArray[i] + " ");

        }
        sc.close();
    }
}
