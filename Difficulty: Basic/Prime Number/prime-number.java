//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static boolean isPrime(int n) {
    // 0 and 1 are not prime numbers
    if (n <= 1) return false;

    // Check from 2 to square root of n
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false; // if divisible, not prime
    }

    return true; // no divisors found, it's prime
}

}