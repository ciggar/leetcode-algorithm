package week3;

/**
 * @author: jia.xue
 * @create: 2020-03-17 22:26
 * @Description 变态跳台阶
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 **/
public class Solution3 {
    public int JumpFloorII(int target) {
        if (target <= 2) return target;
//        return 2 * JumpFloorII(target - 1);
        return (int) Math.pow(2,target - 1);
    }
}