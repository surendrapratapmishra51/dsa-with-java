package TwodimensionalArray.Assignment13;
import java.util.Arrays;

public class spiralPrintingNsquare {

    public static int[][] spiralPrinting(int n ){
        int [][] a = new int[n][n];
        int num = 1;
        int minr = 0, minc = 0;
        int maxr = n-1, maxc = n-1;

        while(num<=n*n){
            // left to right
            for (int j = minr; j <=maxr ; j++) {
                a[minr][j] = num++;
            }minr++;
              // top to bottom
            for (int i = minr; i <=maxr ; i++) {
                a[i][maxc] = num++;
            }maxc--;

            // right to left
            for (int j = maxc; j>=minc;j--){
                a[maxr][j] = num++;
            }maxr--;

            // bottom to top
            for (int i = maxr; i >=minr; i--) {
                a[i][minc] = num++;
            }minc++;


        }
        return a;

    }
    public static void main(String[] args) {
        int n = 3;
        int [][] result = spiralPrinting(n);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

            

    }
}
