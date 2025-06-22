package TwodimensionalArray;

public class productOfAllElement {
    public static void main(String[] args) {

        int[][] arr = {{3,2,1},{6,5,4,},{9,8,7}};
        int m = arr.length;
        int n = arr[0].length;

        int sum = 1;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {

                sum *= arr[i][j];


            }

        }
        System.out.print(sum+" ");


    }
}


