// There is an array A consisting of N integers.
// What is the maximum sum of two integers from A that share their first and last digits? If there are no two integers that share their
// first and last digits, the function should return −1.

// Examples:

// 1. Given A = [405, 45, 300, 300], the function should return 600.
// There are two pairs of integers that share first and last digits:
// (405, 45) and (300, 300). The sum of the two 300s is bigger than the sum of 405 and 45.

// 2. Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.

// 909+9009=9918
// 405+300=705

public class SharedfirstLastMaxSum {
    public static int maximumSum(int [] A){
        int maxSum = -1;

        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                if (getFirstDigit(A[i]) == getFirstDigit(A[j]) && A[i] % 10 == A[j] % 10){
                    maxSum = Math.max(maxSum, A[i] + A[j]);
                }
            }
        }
        return maxSum;
    }
    private static int getFirstDigit(int n) {
        while(n >= 10){
            n/=10;
        }
        return n;
    }
    public static void main(String[] args) {
        int [] A = {405, 45, 300, 300};
        System.out.println(maximumSum(A));
    }
}
