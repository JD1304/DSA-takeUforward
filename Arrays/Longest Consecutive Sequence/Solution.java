class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0) return 0;
        int count = 1;
        int cons = 1;
        int var = nums[0];
        for(int i = 1; i < n; i++)
        {
            if (nums[i] == nums[i - 1] + 1) {
                
                count++;
            }
            else if (nums[i] != nums[i - 1]) {
                
                cons = Math.max(cons, count);
                count = 1; 
            }
        }
        return Math.max(cons, count);
        
    }
}
