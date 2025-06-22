package String.BasicString;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DeclarationAndTakingInput {
    public static void main(String[] args) {
        //Declaration AND initialization of String
        String greeting = "Hello,World";
        System.out.println(greeting);

        //Taking Input From the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message:");
        String userInput = sc.nextLine();

        System.out.println("you entered : "+userInput);

    }
}
