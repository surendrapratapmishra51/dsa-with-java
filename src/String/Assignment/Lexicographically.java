package String.Assignment;

import java.util.Scanner;

public class Lexicographically {
    public static String lexicographicallymax(String str) {

        // split the sentence into words
        String[] words = str.split("\\s+");
        String maxWord = words[0];

        for (String word : words) {
            if (word.compareTo(maxWord) > 0) {
                maxWord = word;

            }
        }

        return maxWord;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String sentence = sc.nextLine();
        //  int n = sentence.length();
        String maxWords = lexicographicallymax(sentence);
        System.out.println(maxWords);

    }
}
