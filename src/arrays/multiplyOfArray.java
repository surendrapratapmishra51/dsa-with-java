package arrays;

public class multiplyOfArray {
    public static void main(String[] args) {

        int[] arr = {2,4,8,2,2,5};
        int n = arr.length;
        int mul = 1;
        for (int i = 0; i <n; i++) {


            mul *=arr[i];

        }
        System.out.print(mul);
    }

}
