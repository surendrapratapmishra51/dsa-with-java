package arrays.Array_revision;

import java.util.Scanner;

public class doublet_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the target sum x");
        int x = sc.nextInt();
        int [] arr= {8,5,4,6,3,2,5,};

        for (int i = 0; i <arr.length; i++) {
            // inner loop
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j] == x){
                    System.out.println(arr[i] +","+arr[j]);
                }

            }


        }
    }
}
