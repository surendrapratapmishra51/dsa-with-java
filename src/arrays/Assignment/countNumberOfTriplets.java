package arrays.Assignment;

public class countNumberOfTriplets {
    public static void main(String[] args) {

        int[] arr = {12, 3, 4, 1, 6, 9};
        int n = arr.length;
        int x = 24;
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {


                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);

                    }

                }

            }

        }
    }
}

