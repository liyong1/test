package com.boris.leet;

import java.util.HashMap;

public class Solution13 {
    // 给定一个罗马数字，将其转换成整数
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(new Solution13().romanToInt(s));
    }

    // 罗马数字中小的数字在大的数字的右边，如： XXVII 可视作 X+X+V+I+I= 27
    // 若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字 如：XIV 可视作 X-I+V=14
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbolValues = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        int num = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int value = symbolValues.get(s.charAt(i));
            if(i<length-1 && value<symbolValues.get(s.charAt(i+1))) {
                num -= value;
            }else {
                num += value;
            }
        }
        return num;
    }
}
