package practice.dsa.arrays;

public class SearchInRotatedSortedArray {
    public static int binarySearch(int startIndex, int endIndex, int[] nums, int target) {
        while (startIndex <= endIndex) {
            // Calculate the middle index
            int mid = startIndex + (endIndex - startIndex) / 2;

            // Check if the target is present at mid
            if (nums[mid] == target) {
                return mid;  // Target found
            }

            // If target is greater, ignore the left half
            if (nums[mid] < target) {
                startIndex = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                endIndex = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }
    public static int getPivotIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while(start != end){
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            mid = (start+end)/2;
            if (nums[mid] < nums[end]) {
                end = mid;
            }
        }
        return start;
    }
    public static int search(int[] nums, int target) {
        // find pivot
        int index =-1;
        int pivot = getPivotIndex(nums);
        index = binarySearch(0,pivot,nums,target);
        if(index == -1){
            index = binarySearch(pivot,nums.length-1,nums,target);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(0,nums.length-6,nums,12));

        int[] nums2 = {1,3,5};
        System.out.println(getPivotIndex(nums2));

        System.out.println(search(nums2,2));
    }
}
