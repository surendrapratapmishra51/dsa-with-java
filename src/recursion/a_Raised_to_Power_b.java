package recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class a_Raised_to_Power_b {
    public static int power(int a,int b){
        if(b==0)
            return 1;
        return a * power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base a  = ");
        int a = sc.nextInt();
        System.out.print("Enter power b  = ");
        int b = sc.nextInt();
        System.out.print(power(a,b));
    }
}
