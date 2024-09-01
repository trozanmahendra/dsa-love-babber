package practice.dsa.arrays;

import java.util.Arrays;

public class AlternateBigAndSmall {

    /*public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        Even positions ascending
        int j=0;
        for(int i=0;i<=arr.length-1;i+=2){
            arr2[i] = arr[j];
            j++;
        }
//        Negative positions descending
        int k=arr.length-1;
        for(int i=1;i<=arr.length-1;i+=2){
            arr2[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(arr2));
    }*/

    public static int[] rotateClockWiseArrayOneElement(int[] ints, int p1, int p2) {
        int temp = ints[p1];
        for (int i = p1; i < p2; i++) {
            ints[i] = ints[i + 1];
        }
        ints[p2] = temp;
        return ints;
    }
    public static int[] rotateAntiClockWiseArrayOneElement(int[] ints, int p1, int p2) {
        int temp = ints[p2];
        for (int i = p2; i > p1; i--) {
            ints[i] = ints[i - 1];
        }
        ints[p1] = temp;
        return ints;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i % 2 != 0) rotateAntiClockWiseArrayOneElement(arr,i,arr.length-1);
        }
        System.out.println(Arrays.toString(arr));

    }
}
