package String.BasicString;

public class capacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        int capacitry = sb.capacity();
        System.out.println(capacitry);

       char character =  sb.charAt(0);
        System.out.println(character);
    }
}
