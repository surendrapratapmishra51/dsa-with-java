package arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int [] arr = {33,43,56,22,77,55};
        int n = arr.length;
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        for (int i = 0; i <n/2 ; i++) {
            int j = n-1-i;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;


        }
        for (int i = 0; i <n ; i++) {


            System.out.print(arr[i]+" ");
        }
    }
}
