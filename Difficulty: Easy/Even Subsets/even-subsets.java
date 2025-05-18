//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.countSumSubsets(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution {
    public int countSumSubsets(int[] arr, int N) {
        int count = 0;
        int totalSubsets = 1 << N; // 2^N subsets

        for (int mask = 0; mask < totalSubsets; mask++) {
            if (mask == 0) continue; // Skip the empty subset

            int sum = 0;

            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }

            if (sum % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
