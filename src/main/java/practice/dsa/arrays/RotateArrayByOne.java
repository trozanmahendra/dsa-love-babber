package practice.dsa.arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public static int[] rotate(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(rotate(rotate(new int[]{1,2,3,4,5,6,7,8,9,0})))));
    }
}
