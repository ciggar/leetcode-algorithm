package week3.greed;

import java.util.Arrays;

/**
 * @author: jia.xue
 * @create: 2020-03-20 14:49
 * @Description
 *
 * 贪心算法 分配饼干
 **/
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
                cookie++;
            }else {
                cookie ++;
            }
        }
        return child;
    }
}