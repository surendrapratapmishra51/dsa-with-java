package arrays;

public class secondMax {
    public static void main(String[] args) {

        int[] arr = {96, 97, 400, 340, 900, 98};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max)
            {
                smax = arr[i];
            }

        }
        System.out.print(smax);
    }
}
