package practice.dsa.arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    static {
        for(int i=0;i<400;i++){
            threeSumClosest(new int[]{1,1,1},0);
        }
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestMin = Integer.MIN_VALUE+1;
        int closestMax = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int l=i+1,r=nums.length-1;
            while (l < r){
                int currentClosestSum = nums[l] + nums[r] + nums[i];
                System.out.print(currentClosestSum+", ");
                if(currentClosestSum >= closestMin && currentClosestSum <= target) {
                    closestMin = currentClosestSum;
                }
                if(currentClosestSum <= closestMax && currentClosestSum >= target) {
                    closestMax = currentClosestSum;
                }
                if(currentClosestSum < target)l++;
                else r--;
            }
        }
        System.out.println("max = "+closestMax);
        System.out.println("target = "+target);
        System.out.println("min = "+closestMin);
//        Make all positives
        if((Math.abs(closestMax -target)) <= (Math.abs(target-closestMin))){
            return closestMax;
        }
        return closestMin;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println("\n===ans===. "+threeSumClosest(nums,1));
    }
}
