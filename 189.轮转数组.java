/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        //int temp = nums[0];
        int[] result = new int[nums.length];
        int length = nums.length;
        for (int i = 0; i < length; i++){
            result[(i+k)%length] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, length);
    }
}
// @lc code=end

