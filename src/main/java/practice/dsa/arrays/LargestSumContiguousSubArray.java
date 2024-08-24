package practice.dsa.arrays;

public class LargestSumContiguousSubArray {

    public static long findUsingBruteForce(int[] arr){
        long sum = Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                long temp =0;
                for(int k=j;k<=i;k++){
                    temp += arr[k];
                    sum = Math.max(temp,sum);
                }
            }
        }
        return sum;
    }
    public static long findUsingBruteForceNSquare(int[] arr){
        long sum = Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            long temp =0;
            for(int j=i;j<arr.length;j++){
                temp += arr[j];
                sum = Math.max(temp,sum);
            }
        }
        return sum;
    }

    public static long findUsingKadanesAlgorithm(int[] arr){
        long max_so_far = Long.MIN_VALUE;
        long max_ending_here = 0;
        for (int j : arr) {
            max_ending_here += j;
            max_so_far = Math.max(max_so_far, max_ending_here);
            max_ending_here = (max_ending_here < 0) ? 0 : max_ending_here;
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int[] arr = {-79 ,-68, -18, -58, -25, -52, -68, -30, -6, -10};
        System.out.println(findUsingBruteForce(arr));
        System.out.println(findUsingKadanesAlgorithm(arr));
        System.out.println(findUsingBruteForceNSquare(arr));
    }
}
