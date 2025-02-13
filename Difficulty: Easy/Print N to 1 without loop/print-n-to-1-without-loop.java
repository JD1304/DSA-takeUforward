//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printNos(N);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

      public static void printNos(int N) {  // Change return type to void
        if (N == 0) return;  // Base Case: Stop when N reaches 0
        
        System.out.print(N + " ");  // Print N first
        printNos(N - 1);  // Recursive Call
    }

    public static void main(String[] args) {
        printNos(5);  // Output: "5 4 3 2 1"
    }
}