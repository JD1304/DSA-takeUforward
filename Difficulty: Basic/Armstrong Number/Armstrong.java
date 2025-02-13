import java.util.Scanner;
public class Armstrong{
    public static boolean isArmstrong(int x){
        int count = 0;
        int a = x;
        int c = x;
        while(a>0)
        {
            a = a/10;
            count++;

        }
        double sum = 0;
        while(x>0)
        {
            int b = x % 10;
            sum = sum + Math.pow(b, count);
            x = x/10;
        }
        return c==sum;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean ans = isArmstrong(X);
        System.out.println(ans);
        
    }
}
