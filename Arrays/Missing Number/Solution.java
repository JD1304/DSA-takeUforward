class Solution {
    public int missingNumber(int[] nums) {
        int k = nums.length;
        int missing = 0;
        for(int i = 0; i <= k; i++)
        {
            int count = 0;
            for(int j = 0; j < k; j++)
            {
                if(i != nums[j])
                {
                    count++;
                }
            }
            if(count == k)
            {
                missing = i;
                break;
            }
        }
        return missing;
        
    }
}
