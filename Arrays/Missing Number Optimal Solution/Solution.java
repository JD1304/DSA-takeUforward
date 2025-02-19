class Solution {
    public int missingNumber(int[] nums) {
        int k = nums.length;
        int expected_sum = (k*(k+1))/2;
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum = sum + nums[i];
        }
        return expected_sum - sum;

}
}
