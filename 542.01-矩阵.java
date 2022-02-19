import java.util.Queue;

/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] dx = new int[] {-1,1,0,0};
        int[] dy = new int[] {0,0,-1,1};
        int[][] result = new int[m][n];
        Queue<int[]> queue = new LinkedList<int[]>();
        
        for (int i = 0; i<m; i++) {
            for (int j = 0;j<n;j++) {
                if(mat[i][j]==0){
                    for(int k=0;k<4;k++){
                        int x = i+dx[k];
                        int y = j+dy[k];
                        if(x>=0&&x<m&&y>=0&&y<n&&mat[x][y]==1&&result[x][y]==0){
                            result[x][y] = 1;
                            queue.offer(new int[]{x,y});
                        }
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int i = poll[0]; int j = poll[1];
            for(int k=0;k<4;k++){
                int x = i+dx[k];
                int y = j+dy[k];
                if(x>=0&&x<m&&y>=0&&y<n&&mat[x][y]==1&&result[x][y]==0){
                    result[x][y] = result[i][j]+1;
                    queue.offer(new int[]{x,y});
                }
            }
        }

        return result;
    }
}
// @lc code=end

