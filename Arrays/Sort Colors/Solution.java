class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i==nums[j])
                {
                    arr.add(nums[j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr.get(i);
        }
    }
}
