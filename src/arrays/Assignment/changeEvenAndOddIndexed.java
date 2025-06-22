package arrays.Assignment;

public class changeEvenAndOddIndexed {
    public static void main(String[] args) {

        int []arr = { 5,8,11,14,17,20};
        int n = arr.length;

        for (int i = 0; i <n; i++) {

            if(i%2==0){
                arr[i] +=10; // increment by 10 at even indexed
            }
            else {
                arr[i] =(2*arr[i]);   // replace second multiple of odd index
            }
        }
        for(int ele: arr){
            System.out.print(ele+" "); // output of the code
        }


    }
}
