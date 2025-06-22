package arrays;

public class sort0sAnds {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1,};
        int n = arr.length;

        int noz = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                noz++;


        }
        for (int i = 0; i < n; i++) {
            if (i < noz)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}

