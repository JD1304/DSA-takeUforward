//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            Solution sol = new Solution();
            System.out.println(sol.getCandidate(n, k));
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    int getCandidate(int n, int k) {
        int current = k;
        while (current * k <= n) {
            current *= k;
        }
        return current;
    }
}

