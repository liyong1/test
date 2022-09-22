package com.boris.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    static class Solution {
        public double lengthOfLongestSubstring(String s) {
            return my(s);
        }

        public double my(String s) {
            int len = s.length();
            Map map = new HashMap<>();
            int left=-1,right=0;
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);

            }
            return 0;
        }
    }
}
