package String.BasicString;

public class IndexingCharacter {
    public static void main(String[] args) {

        // Declaratuon and initialize String
        String message = "Hello, Java";
        // accessing the character
        char firstChar = message.charAt(0);
        char secondChar = message.charAt(1);
        char fifthChar = message.charAt(4);
        char lastChar = message.charAt(message.length()-1);

        // display the character
        System.out.println("First Character "+ firstChar);
        System.out.println("Second Character "+ secondChar);
        System.out.println("Fifth Character "+ fifthChar);
        System.out.println("Last Character "+ lastChar);

        // Iterating through all characters
        System.out.println("All character: ");
        for (int i = 0; i<message.length();i++){
            char currentChar = message.charAt(i);
            System.out.println("Index "+i+":"+currentChar);
        }

    }
}
