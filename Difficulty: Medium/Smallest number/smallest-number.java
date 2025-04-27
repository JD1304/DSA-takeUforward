//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        // If the sum is 0
        if (s == 0) {
            if (d == 1)
                return "0"; // Only 0 is valid when d = 1
            else
                return "-1"; // Not possible for more digits
        }
        
        // If sum is greater than maximum possible with d digits
        if (s > 9 * d) {
            return "-1";
        }
        
        // Create an array to store digits
        int[] digits = new int[d];
        
        // Step 1: Start from the last digit
        s -= 1; // Reserve 1 for the first digit to avoid leading zero
        
        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }
        
        // Step 2: Set the first digit
        digits[0] = s + 1;
        
        // Step 3: Build the number from digits array
        StringBuilder ans = new StringBuilder();
        for (int digit : digits) {
            ans.append(digit);
        }
        
        return ans.toString();
    }
}
