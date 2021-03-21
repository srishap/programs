
public class fact 
{
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}	

	public static void main(String[] args)
	{
		
	int n=6;
		System.out.println("fact of " + n + "is " +fact(n));
		

	}

}
