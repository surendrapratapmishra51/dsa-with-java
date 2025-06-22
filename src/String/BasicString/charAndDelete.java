package String.BasicString;

public class charAndDelete {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.chars().forEach(System.out::println);

        //delete from index 5 to 10
        sb.delete(5,10);
        System.out.println(sb);

    }
}
