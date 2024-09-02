package practice.dsa.arrays;

import java.util.Arrays;

public class TwoSum {
    public static int[] find(int target,int... nums){
        int[] ans = new int[2];

        for(int i=0;i<nums.length-1;i++){
            ans[0] = i;
            for(int j=i+1;j<nums.length;j++){
                System.out.println(nums[i]+" + "+ nums[j] +" == "+ target);
                if(nums[i] + nums[j] == target){
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(6,3,2,4)));
    }
}
