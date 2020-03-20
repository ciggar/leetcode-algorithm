package week3.order;

/**
 * @author: jia.xue
 * @create: 2020-03-20 12:21
 * @Description
 **/

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 *
 * 示例 1:
 *
 * 输入:
 * "tree"
 *
 * 输出:
 * "eert"
 *
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 */
public class Solution451 {

    public String frequencySort(String s) {
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character c : arr) {
            hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<Character>(hashMap.size(),new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return hashMap.get(o2) - hashMap.get(o1);
            }
        });

        for (Character c : hashMap.keySet()) {
            priorityQueue.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!priorityQueue.isEmpty()) {
            Character character = priorityQueue.remove();
            Integer count = hashMap.get(character);
            for (int i=0; i< count; i++) {
                stringBuilder.append(character);
            }

        }
        return stringBuilder.toString();



    }
}