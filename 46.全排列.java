import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    boolean[] used = new boolean[6];
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length ==0){
            return ans;
        }
        dfs(nums);
        return ans;
    }
    public void dfs(int[] nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]){continue;}
            temp.add(nums[i]);
            used[i] = true;
            dfs(nums);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end

