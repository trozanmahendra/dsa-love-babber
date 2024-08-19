package practice.dsa.arrays;

import java.util.Arrays;

public class ZeroOneTwoArray {
    public static int[] dutchNationalFlagMethod(int... ints){
        int low =0;
        int mid =0;
        int high = ints.length-1;
        while(mid<=high){
            if(ints[mid] == 0){
//                int temp = ints[low];
                ints[low] = ints[mid] + ints[low] - (ints[mid]= ints[low]);
//                ints[mid] = temp;
                low++;
                mid++;
            }
            else if(ints[mid] == 1) mid++;
            else if(ints[mid] == 2){
//                int temp = ints[high];
                ints[high] = ints[mid] + ints[high] - (ints[mid] = ints[high]);
//                ints[mid] = temp;
                high--;
            }
        }
        return ints;
    }
    public static int[] countMethod(int... ints){
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i:ints){
            if(i == 0) zeroCount++;
            if(i == 1) oneCount++;
            if(i == 2) twoCount++;
        }
        for(int i=0;i<zeroCount;i++){
            ints[i] = 0;
        }
        for(int i=0;i<oneCount;i++){
            ints[i+zeroCount] = 1;
        }
        for(int i=0;i<twoCount;i++){
            ints[i+zeroCount+oneCount] = 2;
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countMethod(0, 1, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 2, 1, 0)));
        System.out.println(Arrays.toString(dutchNationalFlagMethod(0, 1, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 2, 1, 0)));

    }
}
