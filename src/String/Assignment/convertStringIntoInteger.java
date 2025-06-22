package String.Assignment;

import java.util.Scanner;

public class convertStringIntoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of  lenght less then 9:: ");
        String s = sc.nextLine();
        int n = s.length();

        int num = StringToIntege(s);{
            System.out.println(num);
        }
    }

    public static int StringToIntege(String str){
        int num = 0;
        int n = str.length();
         boolean isNegative = false;
         if(str.charAt(0)=='-'){
             isNegative = true;
             for (int i = 1; i <n; i++) {
                 num = num * 10 +(str.charAt(i)-'0');

             }

         }
         else {
             for (int i = 0; i<n; i++){
                 num = num * 10 +(str.charAt(i)-'0');
             }
         }
         if (isNegative){
             num = - num;
         }
         return num;

    }
}
