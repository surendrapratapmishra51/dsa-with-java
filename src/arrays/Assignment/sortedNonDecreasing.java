package arrays.Assignment;

public class sortedNonDecreasing {
    public static void main(String[] args) {

        int [] num1 = {99,77,55,33,11,1};
        int m = num1.length;
        for (int ele : num1) {
            System.out.print(ele + " ");
        }
            System.out.println(" ");



        int []num2 = {88,66,44,22,2};
        int n = num2.length;
        for(int ele: num2) {
            System.out.print(ele + " ");
        }
            System.out.println(" ");

        int x = m+n;
        int []arr = new int[x];

        int i =0, j=0,k=0;
       //
        //for (int i = 0; i < m && j<n ; i++,j++) {
        while(i<m && j<n) {
            if (num1[i] >= num2[j]) {
                arr[k] = num1[i];
                i++;
                k++;
            } else {
                arr[k] = num2[j];
                k++;
                j++;
            }
            if (i == m) {
                while (j < n) {
                    arr[k] = num2[j];
                    j++;
                    k++;
                }
            }
            if (j == n) {
                while (i < m) {
                    arr[k] = num1[i];
                    k++;
                    i++;
                }
            }
        }
            for (int ele:arr){
                System.out.print(ele+"  ");
            }




    }
}
