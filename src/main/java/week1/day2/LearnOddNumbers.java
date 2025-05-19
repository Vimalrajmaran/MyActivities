package week1.day2;

public class LearnOddNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0; i<=20; i++)
		{
			if((i%2)==1)
			{
				if(i==5) 
				{
					continue;
				}
				System.out.println("Odd number are:"+i);
			}
		}

	}
}