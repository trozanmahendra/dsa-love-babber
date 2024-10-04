package practice.dsa.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void rotateSubArray(int i1,int i2,int[] nums){
        int temp = nums[i2];
        for(int i=i2;i>i1;i--){
            nums[i] = nums[i-1];
        }
        nums[i1] = temp;
    }
    public static void mergeUsingSlidingWindow(int[] nums1, int m, int[] nums2, int n){
        int p1 = 0,p2=0;
        while(p1 < m+n && p2 < n){
            if (nums1[p1] < nums2[p2] && p1 < m) {
                p1++;
            }else{
                rotateSubArray(p1,m,nums1);
                nums1[p1] = nums2[p2];
                m++;
                p2++;
            }
//            System.out.println(Arrays.toString(nums1));
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,0,0,0,0,0,0,0};
        int[] ints1 = {-9,-2,3,4,5,6,7};
//        merge(ints,1,ints1,ints1.length);
        mergeUsingSlidingWindow(ints,4,ints1,ints1.length);
        System.out.println(Arrays.toString(ints));
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        rotateSubArray(2,9,arr);
        System.out.println(Arrays.toString(arr));
    }
}
