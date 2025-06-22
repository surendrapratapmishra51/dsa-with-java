package arrays.Array_revision;

import java.util.Scanner;

public class sortZerosOnesTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,0,1,1,1,2,1,2,0,0};
        int NOZ = 0;
        int NOO = 0;
        int NOT = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) NOZ++;
            if (arr[i] == 1) NOO++;

        }
        for (int i = 0; i <n; i++) {
            if (i<NOZ)
            arr[i] = 0;
            else if(i<NOZ+NOO)
                arr[i] = 1;
            else
                arr[i] = 2;




        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
