package TwodimensionalArray;

public class transposeAndStoreMatrix {
    public static void main(String[] args) {

        //1  2
        //3  4
        //5  6
        int[][] a = {{1,2},{3,4},{5,6}};
        int m = a.length;
        int n= a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println(" ");



        }
        // storing
        System.out.println("transpose of given matrix is");
        int transposr[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                  transposr[i][j] = a[j][i];

                System.out.print( transposr[i][j]+" ");

            }
            System.out.println(" ");

        }

    }
}
