package Stroy_Based_Question;
import java.util.Scanner;
public class Maximum_Number_Of_Parking_Index {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Row = ");
       int r = sc.nextInt();
        System.out.print("col = ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<r; i++){
            int cnt = 0;
            for(int j = 0; j<c;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>max){
                max = cnt;
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}
