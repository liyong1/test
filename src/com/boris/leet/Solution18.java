package com.boris.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 四数之和
public class Solution18 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2};
        int target = 8;
        List<List<Integer>> results = new Solution18().fourSum(nums, target);
        for (List<Integer> result : results) {
            for (Integer integer : result) {
                System.out.print(integer);
                System.out.print(',');
            }
            System.out.println();
        }
    }

    private List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(results, nums,target,0, new ArrayList<>());
        return results;
    }

    private void backtrack(List<List<Integer>> results, int[] nums, int target, int index, List<Integer> temp) {
        if (4 == temp.size()) {
            int sum = temp.get(0) + temp.get(1) + temp.get(2) + temp.get(3);
            if(sum == target) {
                List<Integer> temp1 = new ArrayList<>();
                temp1.add(temp.get(0));
                temp1.add(temp.get(1));
                temp1.add(temp.get(2));
                temp1.add(temp.get(3));
                results.add(temp1);
            }
        } else {
            int sum = 0;
            for (Integer integer : temp) {
                sum += integer;
            }
            if(sum < target) {
                int lettersCount = nums.length;
                for (int i = index; i < lettersCount; i++) {
                    temp.add(nums[i]);
                    int s = temp.size()-1;
                    backtrack(results, nums, target, i + 1, temp);
                    temp.remove(s);
                }
            }
        }
    }
}
