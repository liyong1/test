package com.boris.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            return my(nums1, nums2);
        }

        public double my(int[] nums1, int[] nums2) {
            List l = new ArrayList<>();
            int len1 = nums1.length;
            int len2 = nums2.length;
            int i = 0,j = 0;
            while(i < len1 || j < len2) {
                int i1 = i<len1?nums1[i]:0;
                int j1 = j<len2?nums2[j]:0;
                if(i1<j1) {
                    l.add(i1);
                    i++;
                }else{
                    l.add(j1);
                    j++;
                }
            }


            for (int k = 0; k < l.size(); k++) {
                System.out.println(l.get(k));
            }
            return 0;
        }
    }
}
