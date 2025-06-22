package arrays.Assignment;

public class palindromeCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1};
        ispalindrome(arr);
        System.out.print(ispalindrome(arr));

    }

    public static boolean ispalindrome(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }
}