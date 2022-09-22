package com.boris.leet;

import java.util.Arrays;

public class Solution16 {
    /**
     * 最接近的三个数之和
     */
    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        System.out.println(new Solution16().threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 10000000;
        int n = nums.length;
        // 枚举a
        for (int first = 0; first < n; first++) {
            // 保持和上一次的枚举值不同
            if(first > 0 && nums[first] == nums[first-1]) {
                continue;
            }
            // 枚举b,c，在first+1到n
            int second = first+1;
            int third = n-1;
            while(second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                // 如果和为 target 直接返回答案
                if(sum == target) {
                    return sum;
                }
                // 根据差值的绝对值来更新答案
                if(Math.abs(sum-target) < Math.abs(best-target)){
                    best = sum;
                }
                if(sum < target) {
                    // 如果和小于 target，移动 b 对应的指针
                    second++;
                }else{
                    // 如果和大于 target，移动 c 对应的指针
                    third--;
                }
            }

        }
        return best;
    }
}
