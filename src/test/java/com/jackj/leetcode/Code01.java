/*
 * @copyright (C), 2019-2019, FMCN
 * @fileName:    Code01
 * @author:      Administrator
 * @date:        2019-11-29 13:50
 * @description:
 * history:
 */

package com.jackj.leetcode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能简述
 * <p>
 * author   zhangkangjing
 * date     2019-11-29
 * since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Code01.class)
public class Code01 {
    @Test
    public void test() {

        Integer[] nums = new Integer[]{2, 11, 15, 7};
        Integer target = 9;
        Integer[] result = twoSum(nums, target);
        System.out.println("结果" + Arrays.toString(result));
        System.out.println("运行完毕");
    }

    // 给定 nums = [2, 7, 11, 15], target = 9
    // 因为 nums[0] + nums[1] = 2 + 7 = 9
    // 所以返回 [0, 1]
    public Integer[] twoSum(Integer[] nums, Integer target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new Integer[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}