package arrays;

public class sumOfArrayElement {
    public static void main(String[] args) {

        int[]arr = {95,97,93,94,99,90};
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum += arr[i];

        }
        System.out.print("Sum of array is :" +sum);
    }
}
