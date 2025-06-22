package arrays;

public class isSorted {
    public static void main(String[] args) {

        int[] arr = {34, 43, 45, 75, 84};
        int n = arr.length;
        boolean sort = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sort = false;
                break;
            }
            }
        if(sort){
            System.out.print("sorted array ");

        }
        else{
            System.out.print(" unsorted array");
        }
    }
}
