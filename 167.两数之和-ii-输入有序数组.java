/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //二分查找
        // int[] answer = {-1,-1};
        // for (int i = 0;i<numbers.length;i++){
        //     answer[0] = i+1;
        //     int low = i+1,high = numbers.length-1,flag = 0,test = target-numbers[i];
        //     while (low <= high) {
        //         int mid =low + (high- low)/2;
        //         int num = numbers[mid];
        //         if(test == num) {
        //             flag =  mid;
        //             answer[1] = flag+1;
        //             return answer;
        //         } else if(test< num){
        //             high = mid - 1;
        //         } else low = mid + 1;
        //     }     
        // }
        // return answer;
        
        //双指针
        int left = 0,right = numbers.length-1;
        while (left < right) {
            int sum  = numbers[left]+numbers[right];
            if (sum==target){
                return new int[]{left+1,right+1};
            }else if (sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

