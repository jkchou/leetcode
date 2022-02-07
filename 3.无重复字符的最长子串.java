/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int[] chars = new int[128];
        int left = 0,ans = 0,max = 0;
        while (left < len) {
            ans = 0;
            for (int i = left; i < len; i++) {
                int c = s.charAt(i);
                if(chars[c]==1) {
                    Arrays.fill(chars,0);
                    break;
                }
                chars[c] = 1;
                ans++;
            }
            if(ans>max) max = ans;
            left++;
        }
        return max;
    }
}
// @lc code=end

