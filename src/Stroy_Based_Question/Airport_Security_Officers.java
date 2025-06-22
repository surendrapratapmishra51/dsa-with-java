package Stroy_Based_Question;

import java.util.Scanner;

public class Airport_Security_Officers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // [1,1,0,2,2,2,0,0,0,1]
        int one =0;
        int zero = 0;
        int two = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) zero++;
            else if (arr[i]==1) {
                one++;
            }
            else{
                two++;
            }

        }
        int ans[] = new int[n];
        for(int j = 0; j<zero;j++){
            ans[j] = 0;
        }
        for(int j = zero; j<zero+one; j++){
            ans[j] = 1;
        }

        for(int j = zero+one; j<n; j++){
            ans[j] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");

        }
        System.out.println();



    }
}
