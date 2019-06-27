package question;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-27 10:38
 **/

public class sumTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        int add_target;
        // 遍历寻找
        for (int i = 0; i < n; i++) {
            add_target = target - nums[i];
            for (int j = 0; j < n; j++) {
                if (nums[j] == add_target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    Arrays.sort(result);
                }
            }
        }
        return result;
    }

   /* public int[] twoSum1(int[] nums, int target) {
        // 用二维数组做
        int n = nums.length;
        int[] result = new int[2];
        int[][] add_result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                add_result[i][j] = nums[i] + nums[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(add_result[i][j]==target){
                    result[0] = i;
                    result[1] = j;
                    Arrays.sort(result);
                    return result;
                }
            }
        }
        return new int[]{};
    }*/


    public static void main(String[] args) {
        sumTwoNumbers stn = new sumTwoNumbers();
        int[] nums = {3, 2, 4};
        stn.twoSum(nums, 6);

    }
}
      /*  // 在数组中寻找两个数，和为目标值
        // 返回的是数组的下标
        // 可以先对数组进行排序
        // 然后根据目标值的大小
        // 找到大概位置
        // 题目里没说不会有负数诶

        int n = nums.length;
        int[] result = new int[2];
        int i=0;
        HashMap<Integer,Integer> map;

        // 先记录下标
        map = putTheIndex(nums,n );

        // 对数组进行排序
        Arrays.sort(nums);

        // 可能根本不存在这样的解答
        if(nums[n-1]+nums[n-2]<target)
            return new int[] {};
        else{
            // 判断是否存在负数
            if(nums[0]<0){
                // 则将所有的数都转换为正数，target+两倍
                for(int j=0; j<n;j++){
                    nums[j] -= nums[0];
                    target -= 2*nums[0];
                }
            }
            // 找到第一个比target大的数在数组中的位置
            if(nums[n-1]>target){
                while (nums[i]<=target)
                    i++;
            }else
                i=n-1;

            for(int t=i; t>=0; t--){
                int add_target = target - nums[t];
                for(int r=0;r<t;r++){
                    if(nums[r] == add_target){
                        result[0] = findTheIndex(map,nums[r]);
                        result[1] = findTheIndex(map,nums[t]);
                        if(nums[r]==nums[t])
                            result[0]-=1;
                    }
                }
            }
            return result;
        }
    }

    private HashMap putTheIndex(int[] nums, int n){
        // 新建一个Map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n; i++){
            map.put(i,nums[i]);
        }
        return map;
    }

    private int findTheIndex(HashMap<Integer,Integer> map, int add_target){
        // 遍历map
        for(int i=0;i<map.size();i++){
            if(map.get(i)==add_target)
                return i;
        }
    }*/



