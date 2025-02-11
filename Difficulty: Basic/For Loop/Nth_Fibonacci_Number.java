
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 1;
		int n2 = 1;
		int x = sc.nextInt();
		System.out.print(n1);
		System.out.print(n2);
		for(int i = 0; i < x; i++)
		{
			int n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
