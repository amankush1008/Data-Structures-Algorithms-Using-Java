package graphs;

public class Knapsack_01 {

    // Function to solve the 0/1 knapsack problem using dynamic programming
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build dp table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The result is stored in dp[n][capacity]
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3};
        int[] values = {6,10,12};
        int capacity = 5;
        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
	}
