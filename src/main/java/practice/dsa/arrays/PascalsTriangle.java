package practice.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<Integer> getRow(int rowIndex) {
        long[] facs = new long[rowIndex+1];
        List<Integer> ans = new ArrayList<>();

        long fac = 1;
        for(int i=1;i<facs.length;i++){
            fac *=i;
            facs[i] = fac;
        }
        facs[0] =1;
        System.out.println(Arrays.toString(facs));
        for(int i=0;i<facs.length;i++){
            int coefficient= (int) (facs[rowIndex] / (facs[i] * facs[rowIndex - i ]));
            ans.add(coefficient);
        }

        return ans;
    }


    public static void main(String[] args) {

        System.out.println(getRow(33));
    }
}
