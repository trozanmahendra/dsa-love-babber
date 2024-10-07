package practice.dsa.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
//        find pivot
        int pivotIndex = -1;
        int pivot = 0;
        for(int i=nums.length-2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                pivot = nums[i];
                pivotIndex = i;
                break;
            }
        }
        System.out.println("pivot = "+pivot);
        System.out.println("pivotIndex = "+pivotIndex);
        if(pivotIndex == -1){
            Arrays.sort(nums);
            return;
        }
//        find pivot's successor
        int pivotSuccessor = Integer.MAX_VALUE;
        int psi = -1;
        for(int i=pivotIndex+1;i<nums.length;i++){
            if(nums[i] <= pivotSuccessor && nums[i] > pivot){
                pivotSuccessor = nums[i];
                psi = i;
            }
        }
        System.out.println("pivotSuccessor = "+pivotSuccessor);
        System.out.println("psi = "+psi);
//        swap pivot with its successor
        nums[pivotIndex] = nums[psi] + nums[pivotIndex] - (nums[psi] = nums[pivotIndex]);
//        reverse the elements after the pivotIndex
        System.out.println(Arrays.toString(nums));
        int l=pivotIndex+1;
        int r=nums.length-1;
        while (l<r){
            System.out.println(nums[l] +". >>  "+nums[r]);
            nums[l] = nums[r] + nums[l] - (nums[r] = nums[l]);
            l++;r--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,1};
        System.out.println(Arrays.toString(nums)+". before");
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)+". after");

    }
}
