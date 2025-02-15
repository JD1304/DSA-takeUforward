class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
       
        for(char ch : s.toCharArray() )
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }
        int cnt=0;

       
        s = sb.toString().toLowerCase();
        if(s.trim().isEmpty()) return true;
       
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-i-1))
            {
                cnt++;
            }
            else{
                return false;
            }
        }
        return cnt!=0;

    
        
    }
    public static void main(String[] args)
    {
        String s = "A man, a plan, a canal: Panama";
        Solution obj = new Solution();
        obj.isPalindrome(s);
    }
}
