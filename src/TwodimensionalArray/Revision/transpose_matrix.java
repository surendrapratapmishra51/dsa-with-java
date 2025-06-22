package TwodimensionalArray.Revision;

public class transpose_matrix {
    public static void print(int [][] a){
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = a.length;
        int n = a[0].length;

         print(a);
        System.out.println(" ");
        for (int j = 0; j <n; j++) {
            for (int i = 0; i <m; i++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println(" ");

        }

    }
}
