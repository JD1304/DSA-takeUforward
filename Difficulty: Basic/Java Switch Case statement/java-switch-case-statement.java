//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                // Calculate area of circle
                double r = arr.get(0);
                return r * r * Math.PI;

            case 2:
                // Calculate area of rectangle
                double l = arr.get(0);
                double b = arr.get(1);
                return l * b;

            default:
                // Return 0 for invalid choice
                throw new IllegalArgumentException("Invalid choice. Must be 1 or 2.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the choice
        System.out.println("Enter 1 to calculate the area of a Circle, or 2 for a Rectangle:");
        int choice = sc.nextInt();

        // Create a list to store the inputs
        List<Double> arr = new ArrayList<>();

        // Take user input based on the choice
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double r = sc.nextDouble();
                arr.add(r);
                break;

            case 2:
                System.out.println("Enter the length of the rectangle:");
                double l = sc.nextDouble();
                arr.add(l);

                System.out.println("Enter the breadth of the rectangle:");
                double b = sc.nextDouble();
                arr.add(b);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Call the switchCase method to calculate the area
        double area = switchCase(choice, arr);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);

        // Close the scanner
        sc.close();
    }
}

