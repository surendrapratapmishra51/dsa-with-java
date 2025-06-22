package GGk;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n =");
        int n = sc.nextInt();
        int count = 0;
        int x = n;
        while(x>0) {
            int r = x % 10;
            x = x / 10;
            if (r!=0&& n % r == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
