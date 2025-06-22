package arrays;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {3,1,8,5,4,9,2};
        int x = 10;
        int n = arr.length;

        // solution
        for (int i = 0; i <n; i++) {

            for (int j = i+1; j <n; j++) {
                if (arr[i] + arr[j]== x){
                    System.out.println(arr[i]+" "+arr[j]);
                }

            }

        }
    }
}
