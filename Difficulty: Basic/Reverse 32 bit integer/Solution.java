class Solution {
    public static int reverse(int x) {
        
        int rev = 0;
        while (x != 0) {
            int digit = x % 10; // Extract last digit
            x /= 10; // Remove last digit
            
            // Check for overflow before multiplying rev by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }
            
            rev = rev * 10 + digit; // Append digit
        }
        return rev;
        
    }
    public static void main(String args[])
    {
        int X = 123;
        int rev_1 = reverse(X);
        System.out.println(rev_1);

    }
        
    
}
