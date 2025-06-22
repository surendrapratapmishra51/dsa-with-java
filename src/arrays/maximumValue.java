package arrays;

public class maximumValue {
    public static void main(String[] args) {

        int []arr = {87,55,76,89,65,12,54,99,66,17};
        int max = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }



        }
        System.out.print(max);
    }
}
