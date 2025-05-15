//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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
            ArrayList<ArrayList<Integer>> res = obj.getPairs(arr);
            if (res.size() == 0) {
                System.out.println();
            } else {
                IntMatrix.print(res);
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java




class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr); // O(n log n)

        Set<Integer> seen = new HashSet<>();
        Set<String> pairSet = new HashSet<>(); // To avoid duplicate pairs
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int num : arr) {
            int opposite = -num;

            if (seen.contains(opposite)) {
                int first = Math.min(num, opposite);
                int second = Math.max(num, opposite);
                String key = first + "," + second;

                if (!pairSet.contains(key)) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(first);
                    pair.add(second);
                    result.add(pair);
                    pairSet.add(key);
                }
            }

            seen.add(num);
        }

        // Sorting result list to meet "sorted output" requirement
        result.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0)))
                return Integer.compare(a.get(0), b.get(0));
            return Integer.compare(a.get(1), b.get(1));
        });

        return result;
    }
}

