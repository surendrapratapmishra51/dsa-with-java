package recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int row,int col,int m,int n){
        if(row==m||col==n) return 1;
        int rightways = maze(row,col+1,m,n);
        int downways = maze(row+1,col,m,n);
        return rightways + downways;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number m = ");
        int m = sc.nextInt();
        System.out.print("Enter the col number n = ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));

    }
}
