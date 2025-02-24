//{ Driver Code Starts
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String token : tokens) {
                nums.add(Integer.parseInt(token));
            }
            int[] arr = new int[nums.size()];
            int idx = 0;
            for (int i : nums) arr[idx++] = i;
            Solution solution = new Solution();
            System.out.println(solution.pairWithMaxSum(arr));

            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find the maximum sum of the smallest and second smallest numbers in any subarray
    public int pairWithMaxSum(int arr[]) {
        int n = arr.length;
        if (n < 2) return 0; // No valid pairs if less than 2 elements
        
        int maxScore = 0;

        // Iterate through adjacent pairs
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1]; // Sum of consecutive elements
            maxScore = Math.max(maxScore, sum);
        }

        return maxScore;
    }
    }