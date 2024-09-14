package practice.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void swap(int a,int b){
        a = (b + a) - ((b=a));
    }

    public static int removeDuplicates(int[] nums) {
//        int p1 = 0;
//        int p2 = 0;
//        while(p1<nums.length-1 && p2<nums.length-1){
//            if(nums[p1] == nums[p2]){
//                p2++;
//            }
//            if(nums[p1] < nums[p2]){
//                p1++;
//                nums[p1] = nums[p2] + nums[p1] - (nums[p2] = nums[p1]);
//                p2++;
//            }
//        }
//            return 0;
        int i = 0;
        for(int j=0;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {

        int[] ints = new int[]{1,1,1,1};
        System.out.println(removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));


    }
}
