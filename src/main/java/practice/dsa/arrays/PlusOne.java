package practice.dsa.arrays;

import java.util.Arrays;

public class PlusOne {
    private static int[] plusOne(int[] digits){
        int[] dig = new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i] <10) return digits;
            else {
                digits[i] =0;
            }
        }
            dig[0] = 1;
            for(int i=1;i<dig.length;i++){
                dig[i]=0;
            }
            return dig;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
