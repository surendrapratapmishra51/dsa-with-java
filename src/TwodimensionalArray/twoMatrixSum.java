package TwodimensionalArray;

public class twoMatrixSum {
    public static void main(String[] args) {

        int[][] a = {{3,2,1},{6,5,4,},{9,8,7}};
        int [][] b = {{13,12,1},{60,50,4,},{9,18,27}};
        int m = a.length;
        int n = b[0].length;

        int result[][] = new int[m][n];
        

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
            
                result[i][j] = a[i][j]+b[i][j];

                
            }

            }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(result[i][j]+" ");

            }
            System.out.println(" ");

        }

            }
}
