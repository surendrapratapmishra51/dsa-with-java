package arrays.Assignment;

import java.math.BigInteger;

public class factorialLargeNumber {
    public static void main(String[] args) {
        int n = 50;
        BigInteger factorial =(calculateFactorial(n));
        System.out.print(factorial);

    }
    public static BigInteger calculateFactorial(int n){
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <=n ; i++) {

            result = result.multiply(BigInteger.valueOf(i));

        }
        return result;


    }
}
