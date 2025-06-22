package Leetcode;

public class StringToInt {
    public static void main(String[] args) {

        String str = "surendra";
        int n = str.length();
        int sum = 0;
        for (int i = 0; i < n; i++) { 
            sum += str.charAt(i);
        }
    }
}