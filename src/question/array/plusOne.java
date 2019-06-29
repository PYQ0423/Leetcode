package question.array;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-26 09:38
 **/

public class plusOne {
    // 主要是考虑到可能会进位
    // 比如 449 + 1 = 450
    // 499 + 1 = 500
    // 也就是说最后一位+1，很可能会影响前面的一位，两位，三位
    // 但是进位只会发生在出现9的时候，出现9，前一位就会+1，该位则变为0
    // 而且9必须是连续的，才会出现连续进位
    // 从最后一个数开始看
    public int[] plusOne(int[] digits) {

        int count = 0;
        int n = digits.length;
        // 求出从末尾开始有几个连续的9
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9)
                break;
            else
                count++;
        }

        if (n == 0)
            return new int[]{};
        else if (count == 0 || (n == 1 && count!=1)) {
            digits[n - 1]++;
        }
        else if(count==n){
            int[] digits1 = new int[n+1];
            digits1[0] =1;
            return digits1;
        }
        else {
            for (int i = count; i > 0; i--)
                digits[n - i] = 0;
            digits[n - count - 1]++;
        }
        return digits;
    }
}

