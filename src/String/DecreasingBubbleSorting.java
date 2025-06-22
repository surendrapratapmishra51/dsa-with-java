// Decreasing order of array by using bubble sort
package String;

import static sorting.BubbleSort.print;
import static sorting.BubbleSort.swap;

public class DecreasingBubbleSorting {
    public static void main(String[] args) {
        int arr [] = { 3,4,1,2,5};
        int n = arr.length;
        print(arr);

        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if (arr[j] < arr[j+1]){
                    swap(arr,j,j+1);


                }

            }

        }
        print(arr);

    }
}
