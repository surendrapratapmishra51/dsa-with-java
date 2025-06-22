package recursion;

import java.io.BufferedReader;
import java.util.Scanner;

public class GenerateAllBinaryStrings {
    public static void generate(int n, String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)=='0'){
            generate(n,ans+'0');
            generate(n,ans+1);
        }
        else{
            generate(n,ans+'0');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        generate(n,ans);

    }
}
