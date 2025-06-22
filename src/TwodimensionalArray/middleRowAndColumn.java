package TwodimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class middleRowAndColumn {
    public static List<List<Integer>> displayMiddleRowAndColumn(int [][]a, int size) {
        List<List<Integer>> ans = new ArrayList<>();

        // int [][] c = new int[][];
        // calculate the index of middle row and column
        int middleIndex = size / 2;
        //display the row element
        for (int i = 0; i < size; i++) {


            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < size; j++) {

                // System.out.print(a[middleIndex][j] + " ");
                l.get(a[middleIndex][j]);
            }
            ans.add(l);
        }
        // System.out.println(" ");

        // display the column
        for (int j = 0; j < size; j++) {


            for (int i = 0; i < size; i++) {
                //    System.out.print(a[i][middleIndex]+" ");
                ans.get(a[i][middleIndex]);
            }
            //  System.out.print(" ");



        System.out.print(ans+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] a = {{1,2,3,4,5},{4,5,6,7,8},{9,8,7,6,5},{2,9,7,5,4},{1,4,8,9,3}};
        int size = 5;
        displayMiddleRowAndColumn(a,size);


    }
}
