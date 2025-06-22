package TwodimensionalArray;

public class matrixMultiplication {
    public static void main(String[] args) {

        int[][] a = {{12,8,4},{3,17,14},{9,8,10}};
        int [][] b = {{5,19,3},{6,15,9},{7,8,16}};
        if(b[0].length != a.length){
            // Multiplication not possible
            System.out.print("Multiplication not possible");
        }
        else{ // multiplication possible

            int c[][] = new int[a.length][b[0].length];
            for (int i = 0; i <a.length; i++) {
                for (int j = 0; j <b[0].length; j++) {

                    // c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+ [i][2]*[2][j]
                    for (int k = 0; k <c.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];

                    }
                    System.out.print(c[i][j]+"  ");
                }
                System.out.println(" ");

            }
    }
    }
 }
