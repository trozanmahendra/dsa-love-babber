package practice.dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysSumToK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2};
        int k = 3;
        System.out.println(CountSubArraysSumToK.subarraySum(arr,k));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int sum = 0;
        for(int num : nums){
            sum += num;
            count += map.getOrDefault(sum - k , 0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(map);
        return count;
    }
}
