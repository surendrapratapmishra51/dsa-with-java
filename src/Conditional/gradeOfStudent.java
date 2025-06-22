package Conditional;

import java.util.Scanner;

public class gradeOfStudent {
    public static void main(String[] args) {
    // please enter the marks 0 to 100
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student =");
        int marks = sc.nextInt();

        if(marks>80 && marks<=100){
            System.out.println("Very Good");
        }
        else if (marks>60){
            System.out.println("Good");
        }
        else if (marks>40){
            System.out.println("Average");

        }
        else{
            System.out.println("fail");
        }
    }
}
