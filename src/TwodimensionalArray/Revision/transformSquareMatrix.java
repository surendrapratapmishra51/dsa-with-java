package TwodimensionalArray.Revision;

import static TwodimensionalArray.Revision.transpose_matrix.print;

public class transformSquareMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = a.length;
        int n = a[0].length;
        print(a);
        System.out.println(" ");

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }

        }
            print(a);
        System.out.println();
        // rotate array 90 degree in clockwise

        int x = 0; int b = m-1;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {

                while(x<b){
                    // swap
                     int temp = a[i][x];
                     a[i][x] = a[i][b];
                     a[i][b]= temp;
                     x++;
                     b--;
                }

            }

        }
        print(a);

    }
}
