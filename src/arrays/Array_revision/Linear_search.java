
// Find the x element in the array
package arrays.Array_revision;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int x = sc.nextInt();

        System.out.println("Enter the array ");
        int [] arr = {87,99,57,73,54,88,56,23,43};
        int n = arr.length;

        boolean flage = false;
        for(int i = 0; i<n; i++){
            if(arr[i]==x){
                flage =true;
                break;
            }
        }
        if(flage == true){
            System.out.println("element are found");
        }
        else{
            System.out.println("not found");

        }

        }

    }




