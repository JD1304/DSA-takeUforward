//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int dataTypeSize(String str) {
        if (str.equalsIgnoreCase("Character")) {
            return 2; // Size of char in Java
        } else if (str.equalsIgnoreCase("Integer")) {
            return 4; // Size of int in Java
        } else if (str.equalsIgnoreCase("Long")) {
            return 8; // Size of long in Java
        } else if (str.equalsIgnoreCase("Float")) {
            return 4; // Size of float in Java
        } else if (str.equalsIgnoreCase("Double")) {
            return 8; // Size of double in Java
        } else {
            return -1; // Invalid input
        }
    }

    public static void main(String[] args) {
        System.out.println(dataTypeSize("Character")); // Output: 2
        System.out.println(dataTypeSize("Integer"));   // Output: 4
        System.out.println(dataTypeSize("Long"));      // Output: 8
        System.out.println(dataTypeSize("Float"));     // Output: 4
        System.out.println(dataTypeSize("Double"));    // Output: 8
        System.out.println(dataTypeSize("Unknown"));   // Output: -1
    }
}
