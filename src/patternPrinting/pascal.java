package patternPrinting;

public class pascal {
    public static void main(String[] args) {
        int n = 5;
        //int [][] ans = new int[n][n];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
