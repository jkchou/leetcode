/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;
        while (i>=0){
            int a = nums[left]*nums[left];
            int b = nums[right]*nums[right];
            if(a>=b){
                result[i] = a;
                left++;
            } else {
                result[i] = b;
                right--;
            }    
            i--;
        }
        return result;
    }
}
// @lc code=end

