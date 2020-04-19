package bai8_java;

public class MyMath 
{
	public static void main(String[] args)
	{
		
	}
	
	public static int UCLN(int a ,int b)
	{
		if(a > b)
		{
			return a-=b;
		}
		else if(b > a)
		{
			return b-=a;
		}
		return a;
	}
	
	public static float timmax3float(float a, float b, float c)
	{
		float max=0;
		if(a>b && a>c)
		{
			return max=a;
		}
		else if(b > a && b>c)
		{
			return max=b;
		}
		
		return max=c;
	}
	
	public static float timmin3float(float a, float b, float c)
	{
		float min=0;
		if(a>b && c>b)
		{
			return min=b;
		}
		else if(b > a && c>a)
		{
			return min=a;
		}
		
		return min=c;
	}
	
	public static  boolean checkNguyenTo(int n)
	{
		if(n<=2)
		{
			   return true;
		}
		else 
		{
			for(int i =2;i<=Math.sqrt(n);i++)
			   {
			    if(n % i == 0)
			     return false;
			   }
		}
		return true;
	}
	
	public static int tinhtong(int n)
	{
		int tong=0;
		for(int i=0;i<n;i++)
		{
			tong+=i;
		}
		return tong;
	}
	
	public static int abs(int i)
	{
		return Math.abs(i);
	}
}


















