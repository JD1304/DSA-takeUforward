class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++)
        {
            if(prices[i]<min)
            {
                min = prices[i];
                
            }
            int sum = prices[i] - min;
            if(max<sum)
                {
                    max = sum;
                }
        }
        return max;
        
    }
}
