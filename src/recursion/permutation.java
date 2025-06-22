package recursion;

public class permutation {
    public static void permt(String ans,String str){
        if(str.length()==0){
            System.out.println(ans);
        return;
        }

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            permt(ans+ch,left+right);


        }
    }
    public static void main(String[] args) {
        String str = "surendra";
        permt("",str);

    }
}
