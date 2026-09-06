class Solution {
    public int LCS(int[][] dp, String text1, String text2, int i, int j) {
        if (i >= text1.length() || j >= text2.length())
            return 0;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + LCS(dp, text1, text2, i + 1, j + 1);
        } else {
            dp[i][j] = Math.max(LCS(dp, text1, text2, i + 1, j), LCS(dp, text1, text2, i, j + 1));
        }

        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int dp[][] = new int[l1 + 1][l2 + 1];
         for (int i = 0; i < l1; i++) {
            Arrays.fill(dp[i], -1);
        }

        return LCS(dp, text1, text2, 0, 0);
    }
}