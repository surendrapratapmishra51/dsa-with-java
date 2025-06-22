package String.BasicString;

public class setCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Surendra pratap Mishra");
     // reverse the StringBuilder
       sb.reverse();

       // replace even index to 'a' character
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {

                char ch = 'a';
                sb.setCharAt(i, ch);
            }

        }
        System.out.print(sb);



    }
}
