package practice.dsa.arrays;

import java.util.Objects;
import java.util.PriorityQueue;

public class KthMaxAndMin {

    public static int[] minAndMaxEnhanced(int... ints){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : ints){
            if (i  <= min) min = i;
            if (i >= max) max = i;
        }
        return new int[]{min,max};
    }
    public static int kThMin(int k , int... ints){
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        for(int i:ints){
            integers.add(i);
        }
        Integer kthMax = 0;
        for(int i=0;i<k;i++){
            kthMax = integers.poll();
        }
        return Objects.requireNonNull(kthMax);
    }
    public static int kThMax(int k , int... ints){
        PriorityQueue<Integer> integers = new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i:ints){
            integers.add(i);
        }
        Integer kthMax = 0;
        for(int i=0;i<k;i++){
            kthMax = integers.poll();
        }
        return Objects.requireNonNull(kthMax);
    }
    public static void main(String[] args) {
        int[] arr = {0,4,5,7,2,1,6};
        System.out.println(kThMin(3,arr));
        System.out.println(kThMax(3,arr));

    }
}
