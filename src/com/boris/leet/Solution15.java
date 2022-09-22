package com.boris.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    /**
     * 三数之和
     */
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = new Solution15().threeSum(nums);
        for (int i = 0; i < results.size(); i++) {
            List<Integer> result = results.get(i);
            for (int j = 0; j < result.size(); j++) {
                System.out.print(result.get(j));
                System.out.print(',');
            }
            System.out.println();
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // 先是数组有序递增排序
        Arrays.sort(nums);
        // 存储满足条件的三元组集合
        List<List<Integer>> ans = new ArrayList<>();

        // 枚举a
        for (int first = 0; first < n; first++) {
            // 需要和上一个值不一样
            if(first > 0 && nums[first] == nums[first-1]) {
                continue;
            }

            int target = -nums[first];
            // 枚举c --- 对应从数据的右端开始
            int third = n - 1;

            // 枚举b --- 从a的下一个值开始，且不相同
            for (int second = first + 1; second < n; second++) {
                // 需要和上一次不一样的
                if(second > first+1 && nums[second] == nums[second-1]) {
                    continue;
                }

                while(third>second && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if(second == third) {
                    break;
                }

                if(nums[second]+nums[third] == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
