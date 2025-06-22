package arrays.Array_revision;

import java.util.Scanner;

public class sortZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1};
        int n = arr.length;
        int NOZ = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                NOZ++;

            }
        }
            for (int i= 0; i < n; i++) {
                if (i < NOZ) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }

            }

            for(int ele: arr)
                System.out.print(ele+" ");

    }
}
