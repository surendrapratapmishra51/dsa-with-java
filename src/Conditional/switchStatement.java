package Conditional;
import java.util.*;
public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("Please applied an opperator");
        char op = sc.next().charAt(0);
        System.out.println("enter the second number number");

        int b = sc.nextInt();

        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);

                break;
            case '/':
                System.out.println(a/b);
                break;
            default :
                System.out.println("invalid");
        }
    }
}
