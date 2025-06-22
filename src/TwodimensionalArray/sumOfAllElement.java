package TwodimensionalArray;

public class sumOfAllElement {
    public static void main(String[] args) {

        int[][] arr = {{3,2,1},{6,5,4,},{9,8,7}};
        int m = arr.length;
        int n = arr[0].length;

        int sum = 0;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {

                sum += arr[i][j];


            }

        }
        System.out.print(sum+" ");


    }
}
