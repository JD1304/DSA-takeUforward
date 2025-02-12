//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = (a * b) / gcdValue;
        
        return new int[]{lcmValue, gcdValue};  // Returning array with LCM and GCD
    }

    // Function to calculate GCD using Euclidean Algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        int[] result = lcmAndGcd(a, b);
        
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
}


//{ Driver Code Starts.

// } Driver Code Ends