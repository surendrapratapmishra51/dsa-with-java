package arrays;

import java.util.Arrays;

public class alokSorting {
    public static void main(String[] args) {
        int [] arr = { 310,285,179,652,351,423,861,254,450,520};
        int n = arr.length;
//        for (int i = 0; i <n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println(" ");

        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
