package practice.dsa.prefixsum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
        int count = 0,count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % k == 0)count2--;
        }
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
            map.put(nums[i]%k,map.getOrDefault(nums[i]%k,0)+1);
        }
        for(int val: map.values()){
            count += val*(val-1)/2;
        }
        System.out.println(map);
        System.out.println(count);
        System.out.println(count2);

            return count+count2 > 1;
    }
    public static void main(String[] args) {

    }
}
