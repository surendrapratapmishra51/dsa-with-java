package loops;
import java.util.*;
public class gP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
         int a = 3; int r = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;

        }

    }
}
