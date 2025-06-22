package arrays.Assignment;

public class ChangeEvenAndOddIndexedUsingFunction {
    public static void main(String[] args) {

        int[] arr = {5, 8, 11, 14, 17, 20};
//
        modifyArray(arr);

        printArray(arr);
    }

        // function to modify the array based indexed

        public static void modifyArray ( int[] arr){
        int n = arr.length;
            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    arr[i] += 10; // increment by 10 at even indexed
                } else {
                    arr[i] = (2 * arr[i]);   // replace second multiple of odd index
                }
            }
        }
        // function to print the modified array
        public static void printArray ( int[] arr){
            for (int ele : arr) {
                System.out.print(ele + " "); // output of the code
            }


        }

    }

