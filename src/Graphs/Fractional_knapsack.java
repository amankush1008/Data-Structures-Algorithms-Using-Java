package graphs;
import java.util.Arrays;
import java.util.Comparator;

public class Fractional_knapsack {
	
    static class Item {
        int weight;
        int value;
        double ratio;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }
    }

    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        Item[] items = new Item[n];
        
        // Create items array with weight, value, and value-to-weight ratio
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i]);
        }

        // Sort items based on their value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(o -> -o.ratio));

        double totalValue = 0;
        int currentWeight = 0;

        // Fill the knapsack greedily
        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= capacity) {
                // If the whole item fits into the knapsack, take it completely
                currentWeight += items[i].weight;
                totalValue += items[i].value;
            } else {
                // If only a fraction of the item fits, take the fraction
                int remainingCapacity = capacity - currentWeight;
                totalValue += items[i].ratio * remainingCapacity;
                break;
            }
        }
        
        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = fractionalKnapsack(weights, values, capacity);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}



