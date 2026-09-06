class Solution {
    int count = 0;

    public int num(String s, String t, int i, int j, int dp[][]) {
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length())
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int skip = num(s, t, i + 1, j, dp);
        int take = 0;

        if (s.charAt(i) == t.charAt(j)) {
            take = num(s, t, i + 1, j + 1, dp);
        }
        return dp[i][j] = skip + take;
    }

    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return num(s, t, 0, 0, dp);
    }
}