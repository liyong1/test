package com.boris.sort.force;

public class SequentialSearch {
    /**
     * 顺序查找
     */
    public static void main(String[] args) {
        int[] arrayInt = {5,9,6,4,7,3,11,1};
        int index = search(arrayInt, 8);
        System.out.println(index);
    }

    public static int search(int[] arrayInt, int key) {
        int len = arrayInt.length;
        if (len == 0) {
            return -1;
        }
        for (int i = 0; i < len; i++) {
            if (arrayInt[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
