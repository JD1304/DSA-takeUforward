//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input (arr)
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =
                    Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input (dep)
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] dep = new int[m];
            for (int i = 0; i < m; i++) {
                dep[i] =
                    Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            System.out.println(obj.findPlatform(arr, dep));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the railway station
    static int findPlatform(int arr[], int dep[]) {
        // Step 1: Sort arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n = arr.length;
        
        // Step 2: Initialize pointers and counters
        int plat_needed = 1, max_platforms = 1;
        int i = 1, j = 0;
        
        // Step 3: Process all events in sorted order
        while (i < n && j < n) {
            // If next train arrives before previous one departs, need more platforms
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
            // Else train departs, free up a platform
            else {
                plat_needed--;
                j++;
            }
            // Update result if needed
            max_platforms = Math.max(max_platforms, plat_needed);
        }
        
        return max_platforms;
    }
}