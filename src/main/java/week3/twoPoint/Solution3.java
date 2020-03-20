package week3.twoPoint;

/**
 * @author: jia.xue
 * @create: 2020-03-18 12:53
 * @Description
 **/

import java.nio.charset.Charset;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 *
 */
public class Solution3 {

    public String reverseVowels(String s) {
        if (s.length() <=1 ) {
            return s;
        }

        // 转为小写
        String aes = s.toLowerCase();
        int i = 0, j= s.length()-1;

        // 变成数组
        char[] array = s.toCharArray();

        while(j>i) {
            char val1 = array[i];
            char val2 = array[j];

            if (blongs(val1)){
                if (blongs(val2)){
                    array = reverse(array,i,j);
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else {
                i++;
            }
        }
        return new String(array);

    }

    // 翻转数组
    private char[] reverse(char[] array, int i, int j) {
        char val1 = array[i];
        char val2 = array[j];

        array[i] = val2;
        array[j] = val1;

        return array;

    }


    public boolean blongs(char obj) {
        if (obj == 'a' || obj =='e' || obj == 'i' || obj =='o' || obj =='u'
        || obj == 'A' || obj =='E' || obj == 'I' || obj =='O' || obj =='U'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String hello = solution3.reverseVowels("hello");
        System.out.println(hello);
    }
}