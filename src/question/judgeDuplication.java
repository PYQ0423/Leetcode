package question;

import structure.*;
import static java.util.Arrays.sort;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-24 16:42
 **/

public class judgeDuplication {

    public boolean containsDuplicate(int[] nums) {
        // 遍历数组，如果存在重复，则返回true;
        // 如果不存在重复，则返回false.
        // 判断是否存在重复？
        // 先排序，再判断。
        //sort(nums);
        sortingAlgrithm.BubbleSort(nums);


        // 遍历，看出现的次数
        int n = nums.length;
        if(n==1)
            return false;
        for(int i=1; i<n; i++){
            if(nums[i-1]!=nums[i])
                continue;
            else
                return true;
        }
        return false;
    }

    /*private void sort(int[] nums){
        int n = nums.length;
        int max = 0;
        // 冒泡排序
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(nums[i] > nums[j]){
                    max = nums[i];
                }else
                    max = nums[j];
            }
        }
    }*/
}

