package practice.dsa.arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int l = 0,r = nums.length-1,posCount = 0,res = -1;
        while(l <= r){
            if(nums[l] <= 0 && nums[r] > 0){
                posCount++;
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
                r--;
            }
            else if(nums[r] <= 0) r--;
            else if(nums[l] > 0){
                l++;
                posCount++;
            }
        }
        for(int i=0; i<posCount;i++){
            if(Math.abs(nums[i]) <= posCount && Math.abs(nums[i]-1) >= 0 && nums[Math.abs(nums[i])-1] > 0) nums[Math.abs(nums[i])-1] *= -1;
        }

        for(int i=0; i<posCount;i++){
            if(nums[i] > 0){
                res = i+1;
                break;
            }
        }
        System.out.println(res);
        res = (res == -1) ? posCount+1 : res;
        System.out.println("posCount = "+posCount);

        System.out.println(Arrays.toString(nums));

        return res;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,1,2,3,4,-9,0,0,0,5,-7,-6,-4,6,9,8,2,3,4,5}));
    }
}
