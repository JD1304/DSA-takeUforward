class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int left = 0;
        long total = 0;  // Use long to prevent overflow
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];  // Add current element to the sum

            // Check if window is valid: (nums[right] * window_size) - total > k
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];  // Remove leftmost element
                left++;  // Shrink the window
            }

            // Update the maximum frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
