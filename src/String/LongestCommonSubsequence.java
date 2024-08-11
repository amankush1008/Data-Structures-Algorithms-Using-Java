package string;

public class LongestCommonSubsequence {

    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Fill dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of LCS is in dp[n][m]
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        int n = str1.length();
        int m = str2.length();

        int lcsLength = lcs(str1, str2);
        System.out.println("Length of Longest Common Subsequence is " + lcsLength);
    }
}
