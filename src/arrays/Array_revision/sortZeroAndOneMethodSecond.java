package arrays.Array_revision;

import java.util.Scanner;

public class sortZeroAndOneMethodSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j) {
            if (arr[i] == 0) i++;
            else if (arr[j]==1) j--;
            if(i>j)
            break;
            else if (arr[i]==1 && arr[j]==0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele:arr)
            System.out.print(ele+" ");
    }
}
