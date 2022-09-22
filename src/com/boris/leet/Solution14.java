package com.boris.leet;

public class Solution14 {
    // 编写一个函数来查找字符串数组中的最长公共前缀
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(new Solution14().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1;i<strs.length;i++) {
            prefix = longestCommonPrefix(prefix,strs[i]);
            if("".equals(prefix)) {
                return "";
            }
        }
        return prefix;
    }

    // 获取最长公告前缀
    public String longestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(),str2.length());
        int index = 0;
        while(index< minLength && str1.charAt(index)==str2.charAt(index)) {
            index++;
        }
        return str1.substring(0,index);
    }
}
