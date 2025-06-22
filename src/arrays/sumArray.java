package arrays;

public class sumArray {
    public static void main(String[] args) {

        int[] arr = {56,78,46,75,39,72};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i <n; i++) {


            sum +=arr[i];

        }
        System.out.print(sum);
    }
}
