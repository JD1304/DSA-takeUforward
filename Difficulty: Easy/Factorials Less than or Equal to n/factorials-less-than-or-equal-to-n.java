//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java




class Solution {
    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        factorialHelper(1, 1, n, result);
        return result;
    }

    private static void factorialHelper(long fact, long i, long n, ArrayList<Long> result) {
        if (fact > n) return; // Base case: Stop when factorial exceeds n

        result.add(fact); // Add current factorial to result

        // Recursive call for next factorial
        factorialHelper(fact * (i + 1), i + 1, n, result);
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(1));    // Output: [1]
        System.out.println(factorialNumbers(10));   // Output: [1, 2, 6]
        System.out.println(factorialNumbers(25));   // Output: [1, 2, 6, 24]
        System.out.println(factorialNumbers(100));  // Output: [1, 2, 6, 24]
     } 
     }// Output: [1, 2, 6, 24, 120]
