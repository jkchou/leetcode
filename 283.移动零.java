/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] == 0) {
                fast++;
            } else{
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                fast++;
                slow++;
            } 
        }
    }
}
// @lc code=end

