class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[(i+1)%n]<nums[i])
            {
                count++;
            }
            if(count>1)
            {
                return false;
            }
        }
        return true;
    }
}
