package recursion.Assignment;

import java.util.Scanner;

public class sumOfBetweenTwoNumber {


    public static void summation(int a, int b,int s){
    a++;
        if(a>=b){
            System.out.println(s+" ");
            return;
        }


        if(a%2!=0){
            s +=a;
        }
             summation(a,b,s);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("enter the b = ");
        int b = sc.nextInt();
        summation(a,b,0);
    }
}
