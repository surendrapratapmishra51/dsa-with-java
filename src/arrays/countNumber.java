package arrays;

public class countNumber {
    public static void main(String[] args) {

        int[]arr = {5,7,68,54,12,75,34,52,22,38};
        int x = 15;
        int n = arr.length;
       int count = 0;

        for (int i = 0; i <n ; i++) {
            if(arr[i]>x){
                count++;
            }


        }
        System.out.print(count);
    }

}
