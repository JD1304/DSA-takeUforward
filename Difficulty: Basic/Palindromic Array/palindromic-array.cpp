/*Complete the function below*/

class Solution {
  public:
    // Helper function to check if a number is a palindrome
    bool isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
    
    bool isPalinArray(vector<int> &arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }
};
