package question.array;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-27 10:19
 **/

public class moveZeroes {
    // 要求：
    // 1. 必须在原数组上进行操作
    // 2. 尽量减少操作次数
    // 把0都移到数组的末尾
    // 并且保持其他元素的相对顺序
    // 先遍历一遍，记录下0的个数
    // 判断，如果是0，则将后面的数全部前移
    // 或者可以记录下每个数字的前面总共有几个0
    // 到时候一起前移就好了
    // 用一个map来表示，但是不能保证key是不重复的呀
    // 那我应该如何保存每个非零数字对应的数字0的数量呢？
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] count_zero = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                count++;
            else
                count_zero[i] = count;
        }
        for(int i=0; i<n;i++){
            if(count_zero[i]!=0)
                nums[i-count_zero[i]] = nums[i];
            if(i>=n-count)
                nums[i] = 0 ;
        }
    }
}

