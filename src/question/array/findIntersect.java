package question.array;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-26 08:30
 **/

public class findIntersect {
        public int[] intersect(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length+ nums2.length];
            int index = 0;
            // 先排序
            sort(nums1);
            sort(nums2);

            // 用两个指针分别遍历A和B
            // if(nums1[i]==nums2[j])
            int i=0, j=0;
            // 边界判断
            if(nums1.length==0 || nums2.length==0 || nums2[nums2.length-1]<nums1[0] || nums1[nums1.length-1]<nums2[0])
                return new int[] {};
            while(i<nums1.length&&j<nums2.length){
                if(nums1[i]>nums2[j])
                    // nums1: 1,1,2,2
                    // nums2: 2,2
                    j++;
                else if(nums1[i]<nums2[j])
                    i++;
                else{
                    result[index] = nums1[i];
                    index++;
                    i++;
                    j++;
                }
            }
            int[] result1 = Arrays.copyOf(result,index);
            return result1;
        }

        private void sort(int[] nums){
            for(int i=0;i<nums.length;i++){
                for(int j=nums.length-1; j>i; j--){
                    // 只需比较相邻两个数即可
                    // 从小到大排列
                    if(nums[j-1]>nums[j])
                        swap(j-1,j,nums);
                }
            }
        }

        private void swap(int i, int j, int nums[]){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        public static void main(String[] args){
            int[] nums1 = {1,2,2,1};
            int[] nums2 = {2,2};
            findIntersect fi = new findIntersect();
            fi.intersect(nums1,nums2);
        }
}

