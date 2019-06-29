package question.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.util.Arrays.sort;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-25 09:17
 **/

public class findTheNumber {
    // 只有一个数只出现了一次，其余数都出现了两次
    public int singleNumber(int[] nums) {
        // 还是可以先排序，两个相同的数会在一起
        // 因此，如果一个数和它的前面和后面都不相同，那么它就是那个数
        // 或者如果该数是第一个或最后一个的话
        int n = nums.length;
        if (n == 1)
            return nums[0];
        else if (n == 2)
            return 0;
        else {
            sort(nums);
            if (nums[0] != nums[1])
                return nums[0];
            else if (nums[n - 2] != nums[n - 1])
                return nums[n - 1];
            else {
                for (int i = 1; i < n - 1; i++)
                    if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1])
                        return nums[i];
            }
        }
        return 0;
    }

    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 先给Map赋值
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            map.put(nums[i], (value == null ? 0 : value) + 1);
        }

        // 然后再从Map中取数
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return 0;
    }

    public void entryTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet())
            System.out.println("key= "+ key + " and value= " + map.get(key));

        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

    }
}

