/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0,max=0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length;j++){
                area = dfs(grid,i,j);
                if(area>max) max = area;
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int x,int y) {
        if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]==0){
            return 0;
        }   
        int area = 1;
        grid[x][y] = 0;//important!!!
        area += dfs(grid, x-1, y);
        area += dfs(grid, x+1, y);
        area += dfs(grid, x, y-1);
        area += dfs(grid, x, y+1);
        return area;
    }
}
// @lc code=end

