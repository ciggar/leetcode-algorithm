package week3.twoPoint;

/**
 * @author: jia.xue
 * @create: 2020-03-18 13:41
 * @Description
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 **/
public class Solution4 {

    // 思路有点问题
    // 问题点 针对不等的情况 判断有点问题， 如果出现了 arr[i+1] == val2 和 val1 == arr[j-1] 都存在的情况，那么就只会去验证前一种 这里会有点问题
    public boolean validPalindrome(String s) {
        if (s.length() <= 0 ) {
            return false;
        }
        int i=0,j=s.length()-1,m=0;

        char[] arr = s.toCharArray();
        while (j>i) {
            char val1 = arr[i];
            char val2 = arr[j];
            if (val1 == val2 ) {
                i ++ ;
                j --;
            }else {
                if(arr[i+1] == val2) {
                    i += 2;
                    j --;
                    m ++;
                }
                else if(val1 == arr[j-1]) {
                    i += 1;
                    j -= 2;
                    m ++;
                }else {
                    return false;
                }
            }

        }
        if (m > 1) {
            return false;
        }else {
            return true;
        }
    }


    public boolean validPalindrome2(String s) {
        if (s.length() <= 0) {
            return false;
        }
        int i=0,j=s.length()-1;
        char[] arr = s.toCharArray();
        while (j>=i) {
            char val1 = arr[i];
            char val2 = arr[j];
            if (val1 == val2 ) {
                i ++ ;
                j --;
            }else {
                // 如果出现不相等的情况 那么就需要判断除掉该
                return judge(arr,i+1,j) || judge(arr,i,j-1);
            }
        }
        return true;

    }

    // 判断剩余的
    private boolean judge(char[] arr, int i, int j) {
        while ( j>=i ) {
            char val1 = arr[i];
            char val2 = arr[j];
            if (val1 == val2 ) {
                i ++ ;
                j --;
            }else {
                return false;
            }
        }
        return true;
    }
}