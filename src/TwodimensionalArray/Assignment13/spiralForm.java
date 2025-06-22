package TwodimensionalArray.Assignment13;

public class spiralForm {


        public static void print(int[][] a){
            int m = a.length;
            int n = a[0].length;
            for (int i = 0; i <m; i++) {
                for (int j = 0; j <n; j++) {
                    System.out.print(a[i][j]+" ");

                }
                System.out.println();

            }
            System.out.println();
        }
    public static void main(String[] args) {
            int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int m = a.length;
        int n = a[0].length;
        int minr = 0, minc = 0;
        int maxr = m-1, maxc = n-1;
        print(a);

        while(minr <=maxr && minc <= maxc){
        for (int i = maxr; i >= minr; i--) {
            System.out.print(a[i][minc]+" ");
        }minc++;

            for (int i = minr; i <maxr ; i++) {
                System.out.print(a[i][minc]+" ");
            }minc++;
            for (int i = maxr; i >=minr ; i--) {
                System.out.print(a[i][minc]+" ");

            }minc++;

        }
    }
}
