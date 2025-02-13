//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int sum = 0;
    public static int sumOfSeries(int n) {
        
        if(n==0) return 0;
            
        
        return (n*n*n) + sumOfSeries(n-1);
        
        
       
        // Your code here
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
}