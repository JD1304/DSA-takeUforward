//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

/*You are required to complete this method*/
class Solution {
    static final int MOD = 1000000007;

    public int getSum(int arr[]) {
        int n = arr.length;
        long fact = 1;

        // Calculate (n-1)! % MOD
        for (int i = 1; i < n; i++) {
            fact = (fact * i) % MOD;
        }

        long total = 0;
        long placeValue = 1;

        // For each digit position (units, tens, hundreds...)
        for (int i = 0; i < n; i++) {
            long posSum = 0;
            for (int digit : arr) {
                posSum = (posSum + digit) % MOD;
            }

            // Add contribution of current digit position
            total = (total + (posSum * placeValue % MOD) * fact % MOD) % MOD;
            placeValue = (placeValue * 10) % MOD;
        }

        return (int) total;
    }
}




//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int ans = obj.getSum(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends