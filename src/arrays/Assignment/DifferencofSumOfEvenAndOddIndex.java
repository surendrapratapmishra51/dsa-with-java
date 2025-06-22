package arrays.Assignment;

public class DifferencofSumOfEvenAndOddIndex {
    public static void main(String[] args) {

        int[] arr = {23,43,65,87,97,34,66};
        int n = arr.length;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <n; i++) {
            if(i%2 == 0){
                sumEven +=arr[i];
            }
            else{
                sumOdd +=arr[i];
            }

        }
        int Difference = sumEven-sumOdd;
        System.out.print(Difference+" ");
    }
}
