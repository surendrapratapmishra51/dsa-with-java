package recursion;

public class arrayPrinting {
    public static void array(int i,int [] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        array(i+1,arr);
    }

    public static void main(String[] args) {
        int arr [] = {5,6,7,3,4,9,2,6};
        array(0,arr);
    }
}
