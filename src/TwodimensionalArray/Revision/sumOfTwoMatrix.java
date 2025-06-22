package TwodimensionalArray.Revision;

public class sumOfTwoMatrix {
    public static void print(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {


                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
    
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int b[][] ={{6,5,4},{3,4,5},{7,8,6}};
        int m = a.length;
        int n = a[0].length;
        
        int c[][] = new int[m][n];

        print(a);
        System.out.println(" ");
        print(b);
        System.out.println(" ");

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                c[i][j] = a[i][j]+b[i][j];

            }

        }
        print(c);
        
        
    }
}
