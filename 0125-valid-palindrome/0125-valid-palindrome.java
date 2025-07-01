class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right){
            char lc = Character.toLowerCase(s.charAt(left));
            char rc = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(lc)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rc)){
                right--;
            }
            else if(lc != rc){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
       
    
        
    }
}
   