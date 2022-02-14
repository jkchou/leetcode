/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            char temp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = temp;
        }
        // int left =1, right =len-1;
        // for(int i = left;i<=(right+left)/2;i++){
        //     char temp = s[i];
        //     s[i] = s[right+left-i];
        //     s[right+left-i] = temp;
        // }
    }
}
// @lc code=end

