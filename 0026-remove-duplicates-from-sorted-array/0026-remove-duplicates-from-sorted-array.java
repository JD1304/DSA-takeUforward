class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length == 0) return 0; 
        
        int i = 0; // Slow pointer
        
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) { 
                i++; // Move to the next unique index
                nums[i] = nums[j]; // Place the new unique element
            }
        }
        
        return i + 1; 
}
}
