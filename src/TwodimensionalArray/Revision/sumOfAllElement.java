package TwodimensionalArray.Revision;

public class sumOfAllElement {
    public static void main(String[] args) {
        int a[][] = {{1,2,5},{3,4,8},{5,6,9}};
        int m = a.length;
        int n = a[0].length;
        int sum = 0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                sum += a[i][j];

            }

        }
        System.out.print(sum+" ");

    }
}
