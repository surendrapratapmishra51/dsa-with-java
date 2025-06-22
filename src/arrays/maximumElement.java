package arrays;

public class maximumElement {
    public static void main(String[] args) {

        int[]arr = {65,77,45,43,400,88,23,69,2,86};
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i <n ; i++) {
            if (max<arr[i]){
                         int temp = max;
                        max = arr[i];
                         arr[i]= temp;

            }


        }
        System.out.print(max);


    }
}
