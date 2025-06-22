package sorting;

public class BubbleSort {
    public static void print(int [] a){
        int n = a.length;
        for(int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr [] = { 5,3,2,4,1};
        int n = arr.length;
        print(arr);
        for (int i = 0; i <n-1; i++) {

            for (int j = 0; j <n-1-i; j++) {
                if (arr[j]> arr[j+1]){

                    swap(arr,j,j+1);
                }

            }

        }
        print(arr);

    }
}
