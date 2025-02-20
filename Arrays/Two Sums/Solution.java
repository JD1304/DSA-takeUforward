import java.util.Vector;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Vector<Integer> result = new Vector<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                
                    if(nums[i]+nums[j]==target)
                    {
                        result.add(i);
                        result.add(j);
                        return new int[]{i, j}; 
                    }
                
            }

        }
        return new int[]{}; 
        
        
    }
}05666
