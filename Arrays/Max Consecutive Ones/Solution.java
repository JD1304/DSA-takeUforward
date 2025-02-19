class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
       
        int count = 0;
        int missing = 0;
        for(int i = 0; i < n; i++)
        {
                if(nums[i]==1){
                    count = count + 1;

                }
                
                else
                {
                    count  =  0;
                }
                if(count>missing)
                {
                    missing = count;
                }
            }
        
        return missing;
        
    }
}
