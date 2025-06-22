package arrays;

import java.util.Scanner;

public class rollNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("Enter the roll number element "+ i + " :");
            marks[i] = sc.nextInt();


        }
        System.out.println("Roll number of student with less than 35 marks ");
        for (int i = 0; i <marks.length; i++) {
            if (marks[i] < 35 ){
                System.out.println("student roll number "+ marks[i]+" ");
            }

        }

    }
}
