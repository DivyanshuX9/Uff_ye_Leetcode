class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int a=0;a<=n;a++){
            if (dp[a] == Integer.MAX_VALUE)
                continue;
            for(int cost=1;cost<=3;cost++){
                if(a+cost<=n){
                    dp[a+cost]=Math.min(dp[a+cost],dp[a]+costs[cost+a-1]+cost*cost);
                }
            }
        }
        return dp[n];
    }
}