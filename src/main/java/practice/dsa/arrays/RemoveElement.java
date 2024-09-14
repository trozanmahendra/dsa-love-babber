package practice.dsa.arrays;

import java.util.Arrays;

public class RemoveElement {

    private static int remove(int[] nums,int val){
       int p1 =0;
       int p2 =0;
       while(p1 < nums.length && p2<nums.length){
           if(nums[p1] != val){
               p1++;
               p2++;
           }
           else if(nums[p1] == val && nums[p2] != val){
               nums[p1] = nums[p2] + nums[p1] -(nums[p2] = nums[p1]);
               p1++;
               p2++;
           }
           else if(nums[p1] == val && nums[p2] == val){
               p2++;
           }
       }
        return p1;
    }
    public static void main(String[] args) {
        int[] ints = {1,3,3,3,31,1,2,3,3,3,3,3,44,3,4,3,5,6};
        System.out.println(Arrays.toString(ints));
        System.out.println(remove(ints,3));
        System.out.println(Arrays.toString(ints));
    }
}
