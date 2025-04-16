class Solution {
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store (prefixSum -> frequency)
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Initial prefix sum is zero (important for single element case)

        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            // Check if there is a prefix sum such that (currentSum - prefixSum = k)
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            // Update the map with current prefix sum
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
