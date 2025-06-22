package sorting;

public class Selectionsort2 {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;


                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }
        print(arr);


    }
}



