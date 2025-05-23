//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(
                    token)); // Use Integer.parseInt to parse int values
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling equilibriumPoint() function
            System.out.println(obj.findEquilibrium(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        
        // Step 1: Find total sum
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Step 2: Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Right sum for index i = totalSum - leftSum - arr[i]
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i; // Found equilibrium point
            }
            leftSum += arr[i]; // Update leftSum
        }
        
        return -1; // No equilibrium point
    }
}

