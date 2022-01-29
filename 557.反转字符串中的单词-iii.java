/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        int left = 0, right;
        char[] words = s.toCharArray();
        for (right=0; right < words.length; right++) {
            if(words[right] == ' '){
                reverse(words,left,right-1);
                left = right+1;
            }  
        }
        reverse(words,left,right-1);    
        return String.valueOf(words);
    }
    private void reverse(char[]word,int left,int right){
        // while(left < right){
        //     char temp = word[left];
        //     word[left] = word[right];
        //     word[right] = temp;
        //     left++;
        //     right--;
        // }
        for(int i = left;i<=(right+left)/2;i++){
            char temp = word[i];
            word[i] = word[right+left-i];
            word[right+left-i] = temp;
        }
    }
}
// @lc code=end
