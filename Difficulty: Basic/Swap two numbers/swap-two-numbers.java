class Solution {
    static List<Integer> get(int a, int b) {
        int sum = a + b;
        b = sum - b;
        a = sum - b;
        
        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        
        return result;
    }
}