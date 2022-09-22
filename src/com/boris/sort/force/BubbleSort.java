package com.boris.sort.force;

public class BubbleSort {
    /**
     * 冒泡排序
     * 挨个元素比较，如果小则更换位置，依次循环
     */
    public static void main(String[] args) {
        int[] arrayInt = {5,9,6,4,7,3,11,1};
        bubble(arrayInt);
        for (int j : arrayInt) {
            System.out.print(j);
            System.out.print(',');
        }
    }
     public static void bubble(int[] arrayInt) {
        int len = arrayInt.length;
         for (int i = len; i > 1; i--) {
             for (int j = 0; j < i - 1; j++) {
                 if (arrayInt[j] > arrayInt[j+1]) {
                     int temp = arrayInt[j];
                     arrayInt[j] = arrayInt[j+1];
                     arrayInt[j+1] = temp;
                 }
             }
         }
     }
}
