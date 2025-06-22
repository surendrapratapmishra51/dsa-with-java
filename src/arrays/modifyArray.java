package arrays;

public class modifyArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        // Passing the array to a method
        modifyArray(numbers);
        //Printing the modified array
        System.out.print("Modified array : ");
        for (int num : numbers){
            System.out.print(num+" ");
        }



    }
    // Method that modifier the array
    static void modifyArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            arr[i] = arr[i] *2;

        }
    }
}
