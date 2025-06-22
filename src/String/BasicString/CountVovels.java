package String.BasicString;

import java.util.Scanner;

public class CountVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message ");
        String Input = sc.nextLine();
        int count = 0;
        int n = Input.length(); // Length of the String
        // convert uppercase to lowercase;
         Input = Input.toLowerCase();

        for (int i = 0; i <n; i++) {
            char ch = Input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                count++;  // increase count
            }
        }
        System.out.print("Number of vowels in the string : "+count);  // Display the output




    }
}
