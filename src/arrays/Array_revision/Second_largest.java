package arrays.Array_revision;

public class Second_largest {
    public static void main(String[] args) {
        int []arr = {86,46,98,43,54,76,79,870,890};
        int n = arr.length;

       int max = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            max = Math.max(arr[i],max);


        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            if (arr[i] != max)
                smax = Math.max(arr[i], smax);

        }
        int tmax = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            if(arr[i] != smax && arr[i] != max)
                tmax = Math.max(arr[i],tmax);

        }
        System.out.println(tmax);
    }

}
