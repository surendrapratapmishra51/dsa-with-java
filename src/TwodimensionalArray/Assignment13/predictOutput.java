package TwodimensionalArray.Assignment13;

public class predictOutput {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2,
                3, 4}, {1, 4, 1, 2}};
        int m = matrix.length;
        int sum = 0;
        int n = matrix[0].length;
        for (int row = 0; row < 4; row++) {
            sum = sum + matrix[row][n-1];
        }
        System.out.println(sum);
    }


}
