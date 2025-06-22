package TwodimensionalArray;

public class flippingMatrix {
    public static void main(String[] args) {

        int[][] a = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int m = a.length;
        int n = a[0].length;
        // put 1 at 0th position of every row
        for (int i = 0; i < m; i++) {

            if (a[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 0) {
                        a[i][j] = 1;

                    } else {
                        a[i][j] = 0;
                    }

                }
            }
        }

            // flip those column whose number of 0 is greter then 1's

            for (int j = 1; j<n; j++) {
                int NOzeros = 0;
                int NOOnes = 0;
                for (int i = 0; i <m; i++) {
                    if (a[i][j] == 0) {
                        NOzeros++;
                    } else {
                        NOOnes++;
                    }
                }
                    if(NOzeros>NOOnes){// flip column
                        for (int i = 0; i <m ; i++) {
                            if(a[i][j]==0){
                                a[i][j] = 1;
                            }
                            else{
                                a[i][j] = 0;
                            }


                        }
                            
                        }


                }
            int score = 0;
            int x = 1;
            for(int j =  n-1; j>=0; j--){
                for(int i = 0; i<m; i++){
                    score += (a[i][j]*x);

                }
                x *=2;
            }
        System.out.print(score+" ");

            }
        }

