package String.BasicString;

public class Basic {
    public static void main(String[] args) {
        // creating String
        String greeting = "Hello, ";
        String name = "Surendra";

        // concatenation
        String message = greeting+name;
        // display the result
        System.out.print(message);
        System.out.println(" ");

        //String length;
        int length = message.length();
        System.out.println("length of the message :" +length);

        // Accessing characters
        char firstChar = message.charAt(0);
        System.out.println(" First character:" +firstChar);

        // Substring
        String substring = message.substring(7);
        System.out.println("Substring from index 7: "+ substring);

        // String comparison;
        String anotherName = "John";
        boolean isEqual = name.equals(anotherName);
        System.out.println("Name are equal: "+isEqual);

    }
}
