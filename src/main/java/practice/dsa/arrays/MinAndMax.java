package practice.dsa.arrays;

import java.util.Arrays;

public class MinAndMax {

    public static int[] minAndMaxEnhanced(int... ints){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : ints){
//            if(min <= i) min = i;
            if (i  <= min) min = i;
            if (i >= max) max = i;
        }
        return new int[]{min,max};
    }
    public static int[] minAndMaxUsingSort(int... ints){
        Arrays.sort(ints);
        return new int[]{ints[0],ints[ints.length-1]};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minAndMaxUsingSort(1, 2, 3, 8, 3, 0, 34, 45)));
        System.out.println(Arrays.toString(minAndMaxEnhanced(1, 2, 53, 4, 5,0)));
    }
}
