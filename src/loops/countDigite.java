package loops;
import java.util.*;
public class countDigite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         int count = 0;

        for (; n!=0 ; count++) {
            n/=10;


        }
        System.out.println(count);
    }
}
