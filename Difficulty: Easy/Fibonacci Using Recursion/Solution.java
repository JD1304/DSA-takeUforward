class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 10;
        System.out.println(obj.fib(n)); // Output: 55
    }
}
