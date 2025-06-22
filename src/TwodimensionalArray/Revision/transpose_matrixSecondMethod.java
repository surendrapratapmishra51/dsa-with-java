package TwodimensionalArray.Revision;

import static TwodimensionalArray.Revision.transpose_matrix.print;

public class transpose_matrixSecondMethod {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = a.length;
        int n = a[0].length;
        print(a);
        System.out.println(" ");
        int transpose[][] = new int[m][n];

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {

                transpose[i][j] = a[j][i];


            }


        }
        print(transpose);

    }
}
