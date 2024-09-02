package practice.dsa.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class MissingSmallestPositiveInteger {
    public static int find(int... arr){
        Queue<Integer> integers = new PriorityQueue<>();
        for(int i:arr){
            if(i>0) integers.add(i);
        }
        System.out.println(integers);
        int pqSize = integers.size();
        Integer polled = 0;
        int cursor = 1;
        for(int i=1;i<=pqSize;i++){
            int prevPolled = polled;
             polled = integers.poll();
            if(polled > cursor) return cursor;
            if(prevPolled != polled) cursor++;
        }
        return polled+1;
    }
    public static void main(String[] args) {
        System.out.println(find(-47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24, 36, 44, -11, 45, 20, -16, 28, 17, -49, 47, -48, -33, 42, 2, 6, -49, 30, 36, -9, 15, 39, -6, -31, -10, -21, -19, -33, 47, 21, 31, 25, -41, -23, 17, 6, 47, 3, 36, 15, -44, 33, -31, -26, -22, 21, -18, -21, -47, -31, 20, 18, -42, -35, -10, -1, 46, -27, -32, -5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0, 43, -50, -16, 14, -26));
    }
}
