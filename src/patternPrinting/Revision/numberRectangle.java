package patternPrinting.Revision;

import java.util.Scanner;

public class numberRectangle {
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n = ");
        int n = sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
       int n = getInput();
       for (int i = 0; i<n; i++){
           for(int j = 1; j<=n; j++){
               System.out.print(j+" ");

           }
           System.out.println();
       }
    }
}
