package String.Assignment;

public class palindromeOrNot {
    public static void main(String[] args) {
     String s = "radar";
     int n = s.length();

   StringBuilder reversed = new StringBuilder(s);
   reversed.reverse();
        System.out.println(s);
        System.out.println(reversed);
        String reverseString = reversed.toString();

        if(s.equals(reverseString)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrine");
        }
    }
}
