package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pwrOfNumber {
//    public static int pow(int a, int b){
//        if(b==0) return 1;
//        int ans = a*pow(a,b-1);
//        return ans;
//    }

public static int pow(int a, int b){
    if(b==0) return 1;
int ans = pow(a,b/2);
if(b%2==1) return ans*ans*a;
return ans*ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = pow(n,m);
        System.out.println(ans);
    }
}
