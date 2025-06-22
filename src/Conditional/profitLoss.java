package Conditional;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cp =");
        int cp = sc.nextInt();

        System.out.print("Enter the sp =");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit = "+(sp-cp));
        } if (sp<cp) {
            System.out.println("loss ="+(cp-sp));

        }
        if(cp==sp){
            System.out.println("no profit no loss");
        }
    }
}
