package week1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: jia.xue
 * @create: 2020-01-20 10:30
 * @Description
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 分析： 找无重复数字的最长字串
 *
 *
 * 时间O(N)，空间O(N)。遍历一次字符串，分别用start和end记录最大子串的索引位置。
 * 用t1和t2标记滑动窗口。用一个字典记录滑动窗口内是否有重复字符，如果有则更新滑动窗口位置。
 * 滑动窗口每进一步，判断该滑动窗口字符数与最大字符数大小。如果大于最大字符数则更新最大字符数。
 * 滑动窗口继续前进至字符串末尾。
 *
 * class Solution:
 *     def lengthOfLongestSubstring(self, s: str) -> int:
 *         str_map={}
 *         start=0
 *         end=0
 *         maxLen=1
 *         t1=0
 *         t2=0
 *         num = len(s)
 *         if(num>0):
 *             #初始化字典
 *             for i in range(num):
 *                 str_map[s[i]]=-1
 *             #从1开始
 *             str_map[s[0]]=0
 *             for i in range(1,num):
 *                 if(str_map[s[i]]!=-1 and str_map[s[i]]>=t1):
 *                     t1=str_map[s[i]] +1
 *                 str_map[s[i]]=i
 *                 t2=i
 *                 if(t2-t1+1) > maxLen:
 *                     start = t1
 *                     end = t2
 *                     maxLen = (end-start +1)
 *             return maxLen
 *         else:
 *             return 0
 *
 **/
public class Subject3 {
    public int lengthOfLongestSubstring(String s) {

        // 首先判断s非空
        if (s.length() <= 0 ) {
            return 0;
        }
        // 定义下标起始位置、下标末尾位置
        int minIndex = 0;
        int maxIndex = 0;
        Set<String> hashSet = new HashSet<String>();
        char[] arrayStr = s.toCharArray();
        for (int i = 0; i < arrayStr.length; i++) {
            minIndex = i;
            boolean flag = hashSet.add(String.valueOf(arrayStr[i]));

        }
        return 0;
    }
}