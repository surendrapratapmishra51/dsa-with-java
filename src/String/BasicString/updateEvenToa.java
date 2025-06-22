package String.BasicString;

import java.util.Scanner;

public class updateEvenToa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the message : ");
        String s = sc.nextLine();
        int n = s.length();
        String UpdatesString = UpdateStringPosition(s);
        System.out.print(UpdatesString);
}


        public static String UpdateStringPosition(String s){
        char [] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i+=2) {
                ch[i] = 'a';


            }
            // convert the char array back to a string
            return new String(ch);

        }
    }

