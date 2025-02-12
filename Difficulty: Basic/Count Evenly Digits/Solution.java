public class Solution {
    public static int countDigits(int n){
      int count = 0;
      int a = n;
      while(n>0)
      {
          
          int r = n % 10;
          n=n/10;
          if(r == 0)
          {
              
              continue;
          }
          if(a % r == 0){
              count = count + 1;
          }
          
      }
      return count;
    }
    public static void main(String[] args){
        int N = 23456;
        int digits = countDigits(N);
        System.out.println(digits);

    }
}
