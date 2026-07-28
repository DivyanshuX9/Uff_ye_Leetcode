class Solution {
    public int uniquePaths(int m, int n) {
        int rc=m-1;
        int cc=n-1;
        int dp[][]=new int[m][n];
        
        for(int a=0;a<=cc;a++) dp[rc][a]=1;
        for(int b=0;b<=rc;b++) dp[b][cc]=1;

        for(int a=rc-1;a>=0;a--){
            for(int b=cc-1;b>=0;b--){
                dp[a][b]=dp[a][b+1]+dp[a+1][b];
            }
        }
        return dp[0][0];
    }
}