package arrays;

import java.util.Scanner;

public class sortArray {

    public static void print(int[] a){
        int size = a.length;

        for (int i = 0; i <size; i++) {
            System.out.print(a[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the array size ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println(" enter the value of array");
        for (int i = 0; i <size; i++) {

            arr[i] = sc.nextInt();


            }
        for (int i = 0; i <size-1; i++) {
            for (int j = 0; j <size-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }


        }
        print(arr);


            }

        }



