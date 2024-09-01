package practice.dsa.arrays;


import java.util.Arrays;

public class ZerosToEnd {

    public static int[] withOutMaintainingOrder(int[] ints, int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            if (ints[p2] == 0) {
                p2--;
            }
            if (ints[p1] != 0) p1++;
            if (ints[p1] == 0 && ints[p2] != 0) {
                ints[p1] = ints[p2] + ints[p1] - (ints[p2] = ints[p1]);
                p1++;
                p2--;
            }
            if (ints[p1] == 0 && ints[p2] == 0) {
                p2--;
            }
        }
        return ints;
    }

    public static int[] rotateClockWiseArrayOneElement(int[] ints, int n, int p1, int p2) {
        int temp = ints[p1];
        for (int i = p1; i < p2; i++) {
            ints[i] = ints[i + 1];
        }
        ints[p2] = temp;
        return ints;
    }

    public static int[] withOrder(int[] ints, int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            if (ints[p1] == 0) {
                rotateClockWiseArrayOneElement(ints, n, p1, p2);
                p2--;
            }else
            p1++;
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0,0,0,0,9,8,6,5,4};
        int[] arr1 = {1,0,2,0,3,0,4,0,0,0,0,9,8,6,5,4};
        System.out.println(Arrays.toString(withOutMaintainingOrder(arr, arr.length)));
        System.out.println(Arrays.toString(withOrder(arr1,arr1.length)));

        int [] rt = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(Arrays.toString(rotateClockWiseArrayOneElement(rt,rt.length,0,8)));
    }
}
