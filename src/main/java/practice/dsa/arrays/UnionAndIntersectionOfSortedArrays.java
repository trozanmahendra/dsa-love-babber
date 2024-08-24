package practice.dsa.arrays;

import java.util.*;

public class UnionAndIntersectionOfSortedArrays {
    public static Integer[] unionUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new TreeSet<>();
        for (int i : arr1) {
            unionSet.add(i);
        }
        for (int i : arr2) {
            unionSet.add(i);
        }
        return unionSet.toArray(new Integer[0]);
    }

    public static Integer[] intersectionUsingMap(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int k : arr1) {
            map.put(k, 1);
        }
        for (int j : arr2) {
            if (map.containsKey(j)) map.put(j, 2);
            else map.put(j, 1);
        }
        List<Integer> integers = new ArrayList<>();
        int i = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 2) {
                integers.add(integerIntegerEntry.getKey());
            }
            i++;
        }
        return integers.toArray(new Integer[0]);
    }

    public static ArrayList<Integer> unionOfTwoSortedArraysTheBetterWay(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        ArrayList<Integer> unionList = new ArrayList<>();
        while (p1 < len1 && p2 < len2) {
            if (arr1[p1] < arr2[p2]) {
                if (p1 == 0 || arr1[p1 - 1] != arr1[p1]) unionList.add(arr1[p1]);
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                if(p2 == 0 || arr2[p2 - 1] != arr2[p2]) unionList.add(arr1[p2]);
                p2++;
            } else {
                if(p2 == 0 || arr2[p2 - 1] != arr2[p2]) unionList.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        while (p1 < len1) {
            if (p1 == 0 || arr1[p1 - 1] != arr1[p1]) unionList.add(arr1[p1]);
            p1++;
        }
        while (p2 < len2) {
            if (p2 == 0 || arr2[p2 - 1] != arr2[p2]) unionList.add(arr2[p2]);
            p2++;
        }

        return unionList;
    }

    public static ArrayList<Integer> intersectionOfTwoSortedArraysTheBetterWay(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        ArrayList<Integer> unionList = new ArrayList<>();
        while (p1 < len1 && p2 < len2) {
            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr1[p1] == arr2[p2]) {
                if (p1 == 0 || arr1[p1 - 1] != arr1[p1]) unionList.add(arr1[p1]);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return unionList;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2,2,2,2,2,2, 4, 5, 6, 7, 8, 13,14, 15,15,15};
        System.out.println("union using set        "+Arrays.toString(unionUsingSet(arr1, arr2)));
        System.out.println("intersection using map "+Arrays.toString(intersectionUsingMap(arr1, arr2)));
        System.out.println("The better way");
        System.out.println("union                  "+unionOfTwoSortedArraysTheBetterWay(arr1, arr2));
        System.out.println("intersection           " + intersectionOfTwoSortedArraysTheBetterWay(arr1, arr2));
    }
}
