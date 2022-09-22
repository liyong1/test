package com.boris.leet;

public class Solution11 {
    /**
     * 返回容器可以储存的最大水量
     */
    public static void main(String[] args) {
        int[] l1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution11().maxArea2(l1));
    }
    /**
     * 方法一：暴力法
     */
    public int maxArea(int[] height) {
        int area = 0;
        for (int i=0;i<height.length;i++) {
            for (int j=i+1;j<height.length;j++) {
                area = Math.max(area, (j-i)*Math.min(height[i],height[j]));
            }
        }
        return area;
    }
    /**
     * 方法二：双指针
     */
    public int maxArea2(int[] height) {
        int left = 0,right = height.length-1;
        int areaMax = 0;
        while(left<right) {
            int area = Math.min(height[left],height[right]) * (right-left);
            areaMax = Math.max(area,areaMax);
            // 移动矮的指针
            if(height[left]>height[right]) {
                right--;
            }else{
                left++;
            }
        }
        return areaMax;
    }
}
