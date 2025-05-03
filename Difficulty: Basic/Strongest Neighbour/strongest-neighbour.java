//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends



class StrongestNeighbour {

    // Function to find maximum for every adjacent pair in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sizeOfArray - 1; i++) {
            sb.append(Math.max(arr[i], arr[i + 1])).append(" ");
        }

        // Remove the last space to avoid formatting issues
        System.out.print(sb.toString().trim());
    }
}




//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    StrongestNeighbour obj = new StrongestNeighbour();
		    obj.maximumAdjacent(sizeOfArray, arr);
		    
		    System.out.println();
		
System.out.println("~");
}
	}
}



// } Driver Code Ends