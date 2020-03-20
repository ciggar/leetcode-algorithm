package week3.order;

/**
 * @author: jia.xue
 * @create: 2020-03-20 13:06
 * @Description
 **/



/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 *
 * 示例:
 *
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 *
 */
public class Solution75 {

    public void sortColors(int[] nums) {

        int i = 0, j = nums.length -1;
        int a = 0;
        while ( a < j) {
            if (nums[a] == 0 ) {
                // 和数组首部的元素交换
                swap(nums,a,i);
                i++;
                a++;

            }else  if (nums[a] == 1) {
                // 不变
                a++;
            }else if (nums[a] == 2) {
                // 和尾部元素交换
                swap(nums,a,j);
                j--;
            }

        }
    }

    private void swap(int[] nums, int a, int i) {
        int v1 = nums[a];
        int v2 = nums[i];

        nums[a] = v2;
        nums[i] = v1;
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        solution75.sortColors(new int[]{1,2,0});
    }
}