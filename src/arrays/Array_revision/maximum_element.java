package arrays.Array_revision;

public class maximum_element {
    public static void main(String[] args) {
        int []arr = {87,55,45,89,55,98,45,67,87};
        int n = arr.length;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            if(arr[i]>=max){
                int temp = max;
                max = arr[i];
                arr[i]= temp;
               index = i;

            }

        }
        System.out.println(index);
        System.out.println(max);

    }
}
