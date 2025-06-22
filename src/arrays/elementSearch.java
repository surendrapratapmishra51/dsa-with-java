package arrays;
import java.util.Scanner;
public class elementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x = ");
        int x = sc.nextInt();

        int[] arr = {98,67,76,34,55,12,88,99,76,45};
        int n = arr.length;

        boolean flage = false;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==x) {
                flage = true;

                break;
            }

        }
        if(flage == true){
            System.out.print(" element in found");

        }
        else if( flage == false){
            System.out.print(" element are not found");
        }


    }
}
