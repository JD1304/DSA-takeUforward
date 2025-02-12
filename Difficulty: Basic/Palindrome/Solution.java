class Solution {
    public static boolean isPalindrome(int x) {
        int a = x;
        int rev = 0;
        if(x<0)
        {
            return false;
        }
        else{
            while(x>0)
            {
                int y = x%10;
               
                rev = rev * 10 + y;
                 x = x / 10;
                
            }
        }
        return a == rev;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
        System.out.println(isPalindrome(1221)); // Output: true
    }
}
