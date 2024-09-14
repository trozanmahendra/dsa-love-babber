package practice.dsa.arrays;

public class SearchInsertPosition {
    private static int searchInsert(int[] nums,int target){
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]) return i;
            if(target < nums[i]) return i;
            if(target > nums[i]){
                pos = i+1;
            }

        }
        return pos;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,2,3,4,58},30));
    }
}
