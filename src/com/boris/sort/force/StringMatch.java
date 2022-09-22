package com.boris.sort.force;

public class StringMatch {
    /**
     * 字符串匹配
     * 查找到字串在母串中的位置
     * 当字符匹配，递增下个字符进行比较
     * 当不匹配时，移动模式串对准主串的下一个位置
     */
    public static void main(String[] args) {
        String s0 = "ABCDEFGDCDH";
        String s1 = "DC";
        int index = matchStr(s0.toCharArray(), s1.toCharArray());
        System.out.println(index);
    }

    public static int matchStr(char[] str0, char[] str1) {
        int n = str0.length;
        int m = str1.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (str0[i] == str1[j]) {
                // 当前字符匹配，i,j递增
                i++;
                j++;
            } else {
                // 否则i回退，j回到字串串首，字串重新开始匹配
                i = i - j + 1;
                j = 0;
            }
        }

        if (j >= m)  {
            // 匹配成功，返回下标
            return i-j;
        } else {
            // 匹配失败
            return -1;
        }
    }
}
