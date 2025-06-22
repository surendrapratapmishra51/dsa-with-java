package loops;
import java.util.Scanner;
public class arithmeticProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 4 7 10 13 16 19 22.........upto n
        for(int i = 4; i<=3*n+1; i+=3){
            System.out.println(i);
        }

    }
}
