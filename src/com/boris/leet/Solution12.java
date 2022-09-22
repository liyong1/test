package com.boris.leet;

public class Solution12 {
    // 数字转罗马数字
    public static void main(String[] args) {
        System.out.println(new Solution12().intToRoman2(1994));
    }

    // 罗马数字的唯一表示法,找到最大值符号减掉，再找最大符号值减掉，依次循环表示
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        if (num > 3999 || num < 1) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num = num - value;
                sb.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }

    // 硬编码
    public String intToRoman2(int num) {
        String[] thousands_digit = {"", "M", "MM", "MMM"};
        String[] hundreds_digit = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens_digit = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones_digit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if(num > 3999 || num < 1) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append(thousands_digit[num/1000]);
        sb.append(hundreds_digit[num%1000/100]);
        sb.append(tens_digit[num%1000%100/10]);
        sb.append(ones_digit[num%1000%100%10]);
        return sb.toString();
    }
}
