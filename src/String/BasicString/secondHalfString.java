package String.BasicString;

import java.util.Scanner;

public class secondHalfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the number");
        String s = sc.nextLine();
        int n = s.length();
        if(n%2== 0){
          String resultant = SecondHalf(s);
            System.out.println("Original String: "+s);
            System.out.println("SecondHalf String: "+resultant);
        }else {
            System.out.println("please enter the even Stringp");
        }


    }

    public static String SecondHalf(String str ){
        int n = str.length();
        int midposition = n/2;

        return str.substring(midposition);



    }


}
