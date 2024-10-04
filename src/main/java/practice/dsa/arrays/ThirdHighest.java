package practice.dsa.arrays;

import java.util.Arrays;

public class ThirdHighest {
    public static int find(int[] nums){
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int count = 0;
        int currEle = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] != currEle){
                count++;
                currEle = nums[i];
            }
            if(count == 3) return currEle;
        }
//        System.out.println(count);
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int[] nums = {1,Integer.MIN_VALUE,Integer.MAX_VALUE};
//        int[] nums = {1,1,2};
        System.out.println(find(nums));
    }
}
