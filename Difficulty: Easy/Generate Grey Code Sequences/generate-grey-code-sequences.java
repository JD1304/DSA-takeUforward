//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

class GreyCode
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Solution g = new Solution();
			ArrayList <String> res = g.generateCode(n);
			for (String i : res) 
			    System.out.print (i + " ");
			System.out.println();
		t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*Returns an array of all n-bit gray codes sequence.
You are required to complete below method. */
class Solution {
    ArrayList<String> generateCode(int n) {
        ArrayList<String> result = new ArrayList<>();
        int numCodes = 1 << n;

        for (int i = 0; i < numCodes; i++) {
            int gray = i ^ (i >> 1);
            String binary = Integer.toBinaryString(gray);
          
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            result.add(binary);
        }

        return result;
    }
}
