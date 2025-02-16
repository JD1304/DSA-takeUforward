//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().frequencyCount(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static List<Integer> frequencyCount(int[] arr) {
        int[] hash = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            hash[arr[i]-1] += 1;
            
            
        }
        List<Integer> result = new ArrayList<>();
        for (int i : hash) {
            result.add(i);
        }

        return result;
        // do modify in the given array
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5}; // Example input
        int n = arr.length;
        
        List<Integer> result = frequencyCount(arr);
        
        System.out.println(result);// Output the result
    }
}
