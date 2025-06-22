package TwodimensionalArray.Assignment13;

public class rotateArrayAnticlock {
    
    public static void print(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+ " ");

            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
        int m = a.length;
        int n = a[0].length;
        print(a);

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <i;j++) {
                int temp = a[i][j];
                a[i][j]  = a[j][i];
                a[j][i] = temp;
            }


        }print(a);


        for (int i = 0; i < m/2; i++) {
            for (int j = 0; j <n; j++) {
                int temp = a[i][j];
                a[i][j] = a[m-1][j];
                a[m-1][j] = temp;

            }
            
        }
        print(a);
        
    }
}
