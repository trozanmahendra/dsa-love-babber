package practice.dsa.bit.manupulation;

public class BinaryToInt {
    public static int toInt(String bs){
        int res = 0;
        for(int i=0;i<bs.length();i++){
            res += (int) ((bs.charAt(i) - '0') * Math.pow(2,i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toInt("100101"));
    }
}
