package practice.dsa.bit.manupulation;

public class SingleNonDuplicate {
    public static  int singleNonDup(int[] ints){
        int res = 0;
        for (int anInt : ints) {
            res ^= anInt;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(singleNonDup(new int[]{1,1,2,3,3}));
    }
}
