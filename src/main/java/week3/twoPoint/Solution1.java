package week3.twoPoint;

/**
 * @author: jia.xue
 * @create: 2020-03-17 22:35
 * @Description 双指针
 *
 * 在有序数组中找出两个数，使它们的和为 target。
 **/

/**
 * 题目解析
 *
 * 使用双指针
 *
 * 一个指针初始指向数组头部
 * 一个指针初始指向数组尾部
 *
 * 如果 此时和小于target 那么头部指针向右移动 如果此时和大于target 那么尾部指针向左移动
 *
 *
 */
public class Solution1 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] arr = new int[2];
        while (j>i) {
            int a = numbers[i];
            int b = numbers[j];
            int value = a + b;
            if (target == value) {
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }else if( target > value) {
                i++;
            }else if (target < value) {
                j--;
            }
        }
        return arr;

    }
}