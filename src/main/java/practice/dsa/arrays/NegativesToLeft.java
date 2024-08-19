package practice.dsa.arrays;

import java.util.Arrays;

public class NegativesToLeft {
    public static int[] negativesToLeft(int... ints){
        System.out.println(Arrays.toString(ints));
        int low = 0;
        int high = ints.length-1;
        while (low <= high){
            if(ints[low] >= 0 && ints[high] < 0){
                int temp = ints[low];
                ints[low] = ints[high];
                ints[high] = temp;
                low++;
                high--;
            } else if (ints[low] < 0) {
                low++;
            }else {
                high--;
            }
        }
        return ints;
    }

    public static int[] negativesToRight(int... ints){
        int[] arr = new int[ints.length];
        int j=0,k=ints.length-1;
        for(int i=0;i<ints.length;i++){
            if(ints[i] >= 0){
                arr[j] = ints[i];
                j++;
            }else{
                arr[k] = ints[i];
                k--;
            }
        }
        for(int l=0;l<ints.length;l++) {
            ints[l] =arr[l];

        }
        return ints;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(negativesToLeft(-1, 2, -3, 4, 5, -1, -4, -5, 0, 9, -66, -45, 0, -90, 45)));
        System.out.println(Arrays.toString(negativesToRight(-1, 2, -3, 4, 5, -1, -4, -5, 0, 9, -66, -45, 0, -90, 45)));


    }
}
