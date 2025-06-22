package arrays;

public class stusentRoll {
    public static void main(String[] args) {


        int [] arr = {95,66,45,23,55,24,46,74,13,66};
                int n = arr.length;
        System.out.println("total number of size of arry  = "+n);
        for (int i = 1; i <n; i++) {
            if(arr[i]<=35){
                System.out.print(i+" ");
            }

        }



    }
}
