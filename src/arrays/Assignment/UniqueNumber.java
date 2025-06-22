package arrays.Assignment;

public class UniqueNumber {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8, 11, 7, 8, 6, 3, 2, 5,};

        int unique = findUnique(arr);
        System.out.print(unique + " ");
    }



    //  method to check the unique
    public static int findUnique(int[] arr){
    int uniqueNum = 0;

        for (int i = 0; i < arr.length; i++) {

            uniqueNum ^= arr[i];

        }
        return uniqueNum;

        }
    }


