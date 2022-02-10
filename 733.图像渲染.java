/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, image[sr][sc],newColor);
        return image;
    }

    public void dfs(int[][] image,int x,int y,int curColor,int newColor) {
        if(curColor==newColor||x<0||x>=image.length||y<0||y>=image[0].length||image[x][y]!=curColor){
            return;
        }
        image[x][y] = newColor;
        dfs(image, x-1, y, curColor, newColor);
        dfs(image, x+1, y, curColor, newColor);
        dfs(image, x, y-1, curColor, newColor);
        dfs(image, x, y+1, curColor, newColor);
    }
}
// @lc code=end

