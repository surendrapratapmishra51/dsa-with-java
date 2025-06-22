package arrays;

public class secondLargest {
    public static void main(String[] args) {

        int []arr = { 76,86,45,78,23,98};
        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if(arr[i]>mx){
                smx = mx;
                mx= arr[i];

            }
            else if(arr[i] > smx && arr[i] !=mx){
                smx = arr[i];
            }




        }
        System.out.print(smx);
    }
}
