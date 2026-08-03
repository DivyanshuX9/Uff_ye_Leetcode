class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        dp[0][0] = grid[0][0];
        for(int a=1;a<r;a++){
            dp[a][0]+=dp[a-1][0]+grid[a][0];
        }

        for(int a=1;a<c;a++){
            dp[0][a]+=dp[0][a-1]+grid[0][a];
        }


        for(int a=1;a<r;a++){
            for(int b=1;b<c;b++){
                dp[a][b]=Math.min(dp[a-1][b],dp[a][b-1])+grid[a][b];
                // System.out.println(dp[a][b]);
            }
        }
        return dp[r-1][c-1];
    }
}