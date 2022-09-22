package com.boris.sort.force;

public class SwapSort {
    /**
     * 选择排序
     *  每次选择最小的放在首位，依次往下轮询
     */
    public static void main(String[] args) {
        int[] arrayInt = {5,9,6,4,7,3,11,1};
        swap(arrayInt);
        for (int j : arrayInt) {
            System.out.print(j);
            System.out.print(',');
        }
    }

    public static void swap(int[] arrayInt) {
        int len = arrayInt.length;
        int min;
        for (int i = 0; i < len -1; i++) {
            min = i;
            for (int j = i+1; j < len; j++) {
                if(arrayInt[min] > arrayInt[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arrayInt[i];
                arrayInt[i] = arrayInt[min];
                arrayInt[min] = temp;
            }
        }
    }
}
