package sorting;


public class sortLowercaseString {
    public static void main(String[] args) {
        String  str = "u b m n g";


        String s = str.replaceAll(" ","");
        int n = s.length();

        char[] ch = s.toCharArray();

        for (int i = 0; i <n-1; i++) {
          //  char ch =
            for (int j = 0; j <n-1-i ; j++) {
                if (ch[j]>ch[j+1]){
                    //to swap
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;

                }



            }

        }
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c).append(' ');
        }

        System.out.println(new String(sb)+"  ");




    }

}
