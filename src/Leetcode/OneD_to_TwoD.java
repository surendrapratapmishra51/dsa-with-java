package Leetcode;

public class OneD_to_TwoD {
    public static void main(String[] args) {
        int original[] = {1,2,3,4};
        int m = 2; int n = 2;
        int p = original.length;
//        System.out.println(n);
        int dub[][] = new int[m][n];

        for(int i = 0; i<m; i++){
            for (int j = 0; j <n; j++) {

                dub[i][j] = original[i*n+j];

            }
        }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(dub[i][j]+" ");

            }
            System.out.println(" ");

        }

    }
}
