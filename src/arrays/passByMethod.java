package arrays;

public class passByMethod {
    public static void main(String[] args) {

        int[] arr = {12,34,53,64,33,56};
        System.out.println("Before change array "+arr[0]);
        change(arr);
        System.out.print(" after changing the value "+arr[0]);

    }


    public static void change(int[] x) {
        x[0] =24;

    }
}
