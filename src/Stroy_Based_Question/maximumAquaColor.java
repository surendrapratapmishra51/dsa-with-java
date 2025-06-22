package Stroy_Based_Question;

import java.util.Scanner;

public class maximumAquaColor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String s = sc.nextLine();
        System.out.println("Enete the size of box");
        int l = sc.nextInt();

//        String s = "aaaabbbabaa";
//        int l = 3;
        int n = s.length();

       int max = 0;
       int cnt = 0;
        for (int i = 0; i <n; i++) {

            if(i%l == 0){
                max = Math.max(max,cnt);
                cnt = 0;
            }
            if(s.charAt(i)=='a'){
                cnt++;
            }

        }
        max = Math.max(max,cnt);
        System.out.println(max);
    }
}
