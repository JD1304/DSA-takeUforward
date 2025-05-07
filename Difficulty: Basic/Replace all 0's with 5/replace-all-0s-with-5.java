//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
       
        if (num == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            result = result + (digit * place);
            place = place * 10;
            num = num / 10;
        }

        return result;
    }
}
