package arrays;

public class sortTwoArray {
    public static void main(String[] args) {

        int [] a = {11,15,18,22,25};
        int [] b = {2,4,13,16,18,23,30,87};
       // int [] c = {};

        for (int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        for (int ele: b){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        int m = a.length;
        int n = b.length;
        int i=0,j=0,k=0;
        int x = m+n;
        int[] c = new int[x];

        //Merging array

        while((i<m) && (j<n)){
            if(a[i] <= b[j]){
            c[k] = a[i];
            i++;
            k++;
            }
            else{
                c[k]= b[j];
                j++;
                k++;

            }
        }
        if(i==m){
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }

        }
        if(j==n){
            while(i<m){
                c[k]=b[i];
                i++;
                k++;
            }
        }
        for (int ele: c){
            System.out.print(ele+" ");
        }
    }
}
