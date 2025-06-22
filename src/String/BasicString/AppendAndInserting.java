package String.BasicString;

import java.util.Scanner;

public class AppendAndInserting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message ");
        StringBuffer Input = new StringBuffer(sc.nextLine());

        System.out.print(" Enter the message which need to append =  ");
        String appendInput = sc.nextLine();
        // display the original message
        System.out.println(Input+" ");

        // append the String
        Input.append(appendInput);
        System.out.println(" "+Input);

        // inserting content at specific position
        Input.insert(8," pratap ");
        System.out.println(Input+" ");

    }
}
