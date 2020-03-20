package week3;

/**
 * @author: jia.xue
 * @create: 2020-03-17 22:22
 * @Description 斐波那契数列
 **/
public class Solution2 {
    public int Fibonacci(int n) {
        // 解题思路，把数列放到数组里面
        if(n <= 1) return n;

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}