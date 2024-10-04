package practice.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)) map.put(n,2);
            else map.put(n,1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
