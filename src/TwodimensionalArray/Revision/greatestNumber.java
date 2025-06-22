package TwodimensionalArray.Revision;

public class greatestNumber {
    public static void main(String[] args) {
        int a[][] = {{1,2,5},{3,4,8},{5,6,9}};
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {


                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                max = Math.max(max,a[i][j]);


            }

        }
        System.out.print("greatest number of the array is"+ max+" ");
    }
}
