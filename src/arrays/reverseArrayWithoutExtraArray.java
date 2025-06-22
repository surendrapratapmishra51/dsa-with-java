package arrays;

public class reverseArrayWithoutExtraArray {
    public static void main(String[] args) {

        int[] arr = {23, 35, 40, 45, 50, 55, 60, 65, 77};
        int n = arr.length;
        System.out.println("Original Array ");
        printArray(arr);
        reverseArray(arr);
        System.out.println(" ");
        System.out.println("Reverse Array");
        printArray(arr);
    }
        public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

    }
    public static void printArray(int[] arr){
            for (int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

}
