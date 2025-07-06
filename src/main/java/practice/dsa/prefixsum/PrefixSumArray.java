package practice.dsa.prefixsum;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
