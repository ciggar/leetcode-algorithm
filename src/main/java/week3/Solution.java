package week3;

/**
 * @author: jia.xue
 * @create: 2020-03-17 21:52
 * @Description
 **/
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        // 注意题目 长度为n的数组所有数字都在0~n-1范围之内，那么可以把相对应的数字放到相应的位置
        // 先判断
        if (length <= 1 || numbers.length <=1 ) {
            return false;
        }
        for(int i=0;i<length;i++) {
            while (numbers[i] != i){
                if (numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }else{
                    swap(numbers,i);
                }
            }
        }
        return false;
    }
    public void swap(int numbers[],int i) {
        int target = numbers[i];
        int value = numbers[target];
        numbers[i] = value;
        numbers[target] = target;
    }
}