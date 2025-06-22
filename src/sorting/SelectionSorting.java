package sorting;

public class SelectionSorting {
    public static void print(int [] a ){
        int n = a.length;
        for(int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] arr = {7, -3, 8, 2, 1};
        int n = arr.length;
        print(arr);


        // Selection Sort

        for (int i = 0; i <n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j <n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;

                }

            }
            // swap arr[i] and arr[mindx]
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }
        print(arr);

    }
}
