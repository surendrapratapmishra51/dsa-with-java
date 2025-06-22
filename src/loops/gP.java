package loops;

import java.util.Scanner;

public class gP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
// 1 2 4 8 16...........
        for (int i = 1; i<=n; i++) {
            System.out.println(a);

            a *=2;
        }
    }
}
