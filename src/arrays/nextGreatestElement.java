package arrays;

import static java.lang.Math.max;

public class nextGreatestElement {
    public static void main(String[] args) {

        int[] a = {12, 4, 65, 34, 56, 22, 32};
        int n = a.length;
        int nge = a[n - 1];

        int[] ans = new int[n];
        for (int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = nge;
            nge = max(nge, a[i]);



        }

        for (int ele : ans) {
            System.out.print(ele + " ");

        }
    }
}
