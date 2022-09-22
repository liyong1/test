package com.boris.test;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = -123;
        System.out.println(solution.reverse(i));
    }

    static class Solution {
        public int reverse(int x) {
            return my(x);
        }

        public int my(int x) {
            int res = 0;
            while (x != 0) {
               //每次取末位数
                int temp = x % 10;
                // 判断是否大于最大整数
                if (res > 214748364 || (res==214748364 && temp>7)) {
                    return 0;
                }
                //判断是否小于最小整数
                if(res < -214748364 || (res==-214748364 && temp<-8)) {
                    return 0;
                }
                res = res*10+temp;
                x = x/10;
            }
            return res;
        }
    }
}
