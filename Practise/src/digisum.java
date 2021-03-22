
public class digisum 
{

	public static void main(String[] args)
	{
		int num=222;
		int rem=0;//initializing
		int sum=0;//initializing
		while(num>0)
		{
			rem=num%10;//256%10==6//updated 25%10=5...........
			sum+=rem;//0+6=6//updated 6+5=11//11+2=13
			num=num/10;//256/10=25//updated 25/10=2............
		}
		System.out.println(sum);
	

	}

}//we can do using separate method like givinhg int n as arguments
