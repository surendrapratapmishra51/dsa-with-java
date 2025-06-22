package Conditional;

import java.util.Scanner;

public class triangleOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side a=");
        int a = sc.nextInt();
        System.out.println("Enter the Side b=");
        int b = sc.nextInt();
        System.out.println("Enter the Side c=");
        int c = sc.nextInt();

        if((a+b)>c && a+c >b && b+c>a){
            System.out.println("it is triangle");
        }
    else{
            System.out.println("not triangle");
        }
    }
}
