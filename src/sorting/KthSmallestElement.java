package sorting;

public class KthSmallestElement {
    public static void print(int[] arr) {
        int k = arr.length;

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println(" ");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 2, 7, 8,};
        int k = arr.length;
        print(arr);
        // sorting the arrays
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        print(arr);
        for (int i = 0; i < k - 1; i++) {
            if (i==arr[k]) {
                int kthSmallest = arr[i];

            }
        }


    }

}
