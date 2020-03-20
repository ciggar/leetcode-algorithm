package week3.order;

import java.util.List;

/**
 * @author: jia.xue
 * @create: 2020-03-18 21:22
 * @Description
 *
 *
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
 * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 **/
public class Solution524 {

    public String findLongestWord(String s, List<String> d) {

        String longestWord = "";

        for (String target : d) {

            int l1 = longestWord.length();
            int l2 = target.length();


            // 如果 longestWord 比 target 短 || 或者他俩一样长但是longestWord字典序比较大
            if (l1 > l2  || (l1 == l2 && longestWord.compareTo(target) < 0 )) {
                continue;
            }else {

                // 判断 target 是不是 s的子序列 如果是 赋值给longestWord
                if (isSonseq(target,s)) {
                    longestWord = target;
                }
            }

        }
        return longestWord;

    }
    // 判断target是不是s的子序列
    private boolean isSonseq(String target, String s) {
        int m =0, n = 0;
        while (m < target.length() && n< s.length()) {
            if (target.charAt(m) == s.charAt(n)) {
                m ++ ;
                n ++ ;
            }else {
                n ++ ;
            }

            if (m == target.length()) {
                return true;
            }
        }
        return false;

    }
}