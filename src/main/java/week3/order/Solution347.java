package week3.order;

import java.util.*;

/**
 * @author: jia.xue
 * @create: 2020-03-20 11:08
 * @Description
 *
 *
 *
给定一个非空的整数数组，返回其中出现频率前 k 高的元素。

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]
说明：

你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。


 **/
public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums)
        {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        // 自定义一个优先队列 hashMap中value值小的在前面
        PriorityQueue pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashMap.get(o1) - hashMap.get(o2);
            }
        });

        for (Integer key : hashMap.keySet()) {
            if (pq.size() <k) {
                pq.add(key);
            }else if (hashMap.get(key) > hashMap.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        while (pq.size() > 0 ) {
            list.add((Integer) pq.remove());
        }

        return list;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{5,3,1,1,1,3,73,1};
        Solution347 solution347 = new Solution347();
        List<Integer> list = solution347.topKFrequent(arr, 2);
        System.out.println(list.stream().toArray());
    }
}