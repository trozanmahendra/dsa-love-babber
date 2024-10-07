package practice.dsa.arrays;

public class FirstAndLastInSortedArray {
    public  static int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearchToGetFirst(nums,target),binarySearchToGetLast(nums,target)};
    }
    public static int binarySearchToGetFirst(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right) {
           int mid = left +( right - left) / 2;
            if(nums[mid] == target){
                res = mid;
                right = mid-1;
            }else if(nums[mid] > target){
                right = mid-1;
            }
            else left = mid +1;
        }
        return res;
    }

    public static int binarySearchToGetLast(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right) {
            int mid = left +( right - left) / 2;
            if(nums[mid] == target){
                res = mid;
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid+1;
            }
            else right = mid -1;
        }
        return res;
    }


    public static void main(String[] args) {
//                    0,1,2,3,4,5,6,7,8,9,10
        int[] nums = {1,1,1,2,2,2,2,2,3,4,5,6};
        System.out.println(binarySearchToGetFirst(nums,2));
        System.out.println();
        System.out.println(binarySearchToGetLast(nums,2));
    }
}
