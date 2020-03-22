package week3.byteDance.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: jia.xue
 * @create: 2020-03-22 15:35
 * @Description
 **/
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return retList;
        }

        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++) {
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int leftIndex = i+1,lastIndex = nums.length-1,sum = 0-nums[i];
                if (nums[i] > 0) return retList;
                while(leftIndex < lastIndex) {
                    if (nums[leftIndex] + nums[lastIndex] == sum){
                        retList.add(Arrays.asList(nums[i],nums[leftIndex],nums[lastIndex]));
                        while (leftIndex < lastIndex && (nums[leftIndex] == nums[leftIndex+1])) leftIndex++;
                        while((leftIndex < lastIndex) && (nums[lastIndex] == nums[lastIndex - 1])) lastIndex--;
                        leftIndex++;
                        lastIndex--;
                    }else if(nums[leftIndex] + nums[lastIndex] < sum){
                        while((leftIndex < lastIndex) && (nums[leftIndex] == nums[leftIndex+1])) leftIndex++;
                        leftIndex++;
                    }else{
                        while(leftIndex < lastIndex && (nums[lastIndex] == nums[lastIndex-1])) lastIndex--;
                        lastIndex--;
                    }


                }
            }
        }
        return retList;
    }

}