class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length-1;
        int c=obstacleGrid[0].length-1;
        int dp[][]=new int[r+1][c+1];
        
        for(int a=r;a>=0;a--){
            if(obstacleGrid[a][c]==1) break;
            dp[a][c]=1;
        } 
        for(int a=c;a>=0;a--){
            if(obstacleGrid[r][a]==1) break;
            dp[r][a]=1;
        } 
        for(int a=r-1;a>=0;a--){
            for(int b=c-1;b>=0;b--){
                if(obstacleGrid[a][b]==1) dp[a][b]=0;
                else dp[a][b]=dp[a+1][b]+dp[a][b+1];
            }
        }
        return dp[0][0];
    }
}