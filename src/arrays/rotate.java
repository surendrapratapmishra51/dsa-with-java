package arrays;

import org.w3c.dom.ls.LSOutput;

public class rotate {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5,};
        int n = arr.length - 1;
        int lastelement = arr[n];

        for (int i = n; i >0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastelement;
        for(int ele: arr)

        System.out.println(ele+" ");

       // System.out.println(arr[i]);
    }

}
