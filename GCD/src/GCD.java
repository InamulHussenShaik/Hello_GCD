import java.util.Scanner;
public class GCD 
{
	   static int findGcd(int m , int n)
	{
		while(n!=0)
		{
			int rem= m%n;
			m=n;
			n=rem;
		}
		int gcd = m;
		return gcd;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter two numbers to find GCD: ");
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res =GCD.findGcd(m, n);
		System.out.println("The GCD  of "+m+" and "+n+" is "+res);
		
	}

}

