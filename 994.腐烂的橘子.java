import java.util.Queue;

/*
 * @lc app=leetcode.cn id=994 lang=java
 *
 * [994] 腐烂的橘子
 */

// @lc code=start
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dx = new int[] {-1,1,0,0};
        int[] dy = new int[] {0,0,-1,1};
        int result = 0;
        int count = 0;
        Queue<int[]> queue = new LinkedList<int[]>();
        //腐烂橘子入列，记住新鲜橘子数量
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++){
                if(grid[i][j]==2){
                    queue.offer(new int[] {i,j});
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }

        while (count > 0 && !queue.isEmpty()){
            int size = queue.size();
            for(int num = 0; num < size; num++){
                int[] poll = queue.poll();
                int i = poll[0];
                int j = poll[1];
                //腐烂周围橘子
                for (int k=0;k<4;k++){
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        grid[x][y]++;
                        count--;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
            result++;
        }        
        if(count>0) {return -1;}
        return result;
        
    }
}
// @lc code=end

2 1 1
0 1 1
1 0 1