class Solution {
    private int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int total = 0;
        int preValue = 0;
        for(int i = s.length()-1; i >= 0; i--)
        {
            int currentValue = getValue(s.charAt(i));
            if(currentValue<preValue)
            {
                total -= currentValue;
            }
            else
            {
                total +=currentValue;
            }
            preValue = currentValue;
        }
        return total;
        
    }
}
