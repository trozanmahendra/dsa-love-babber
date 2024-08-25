package practice.dsa.arrays;

import java.util.Arrays;

public class MinimizeHeights {
    public static int doStuff(int k,int[] arr){
//        Maximize or minimize heights to avoid negatives;
        Arrays.sort(arr);
        int maxVal = arr[arr.length-1];
        int minVal = arr[0];
        int ans = maxVal - minVal;

       for(int i=1;i<arr.length;i++){
           minVal = Math.min(arr[0]+k,arr[i]-k);
           maxVal = Math.max(arr[i-1]+k,arr[arr.length-1]-k);
           if(minVal < 0) continue;  // only when you wish to avoid negative heights
           ans = Math.min((maxVal-minVal),ans);
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,10};
        System.out.println(doStuff(2,arr));
    }
}
