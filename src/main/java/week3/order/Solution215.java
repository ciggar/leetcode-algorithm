package week3.order;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: jia.xue
 * @create: 2020-03-18 22:14
 * @Description
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 **/
public class Solution215 {

    // 快排
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];

    }

    // 堆排序
    // PriorityQueue 是优先队列 默认是升序

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 小顶堆
        for (int val : nums) {
        pq.add(val);
        if (pq.size() > k) // 维护堆的大小为 K
            // 队首元素出队
            pq.poll();
        }
        // 返回队首元素
        return pq.peek();
    }
}