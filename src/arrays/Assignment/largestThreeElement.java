package arrays.Assignment;
import java.sql.SQLOutput;
import java.util.*;
public class largestThreeElement {
    public static void main(String[] args) {

        int[] arr = {34,76,54,24,98,45,88};
        int n = arr.length;

        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        for (int i = n-1; i >=n-3; i--) {
            System.out.println(arr[i]+" ");
            
        }

    }
}
