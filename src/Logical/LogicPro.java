package Logical;

import java.util.ArrayList;

public class LogicPro
{
	
	public static void seqNo(int n)
	{
		System.out.println(n);
		if(n<10)
			seqNo(++n);
	}
	public static int recursiveFactorial(int fact)
	{
		if(fact==0)
			return 1;
		else
			return fact*(recursiveFactorial(fact-1));
	}
	public static void armstrongsInRange(int from,int to)
	{
		if(from>to)
		{
			from=from+to;
			to=from-to;
			from=from-to;
		}
		for(int i=from;i<=to;i++)
		{
			if(ArmstrongNo(i))
				System.out.print(i+", ");
		}
	}
	public static void checkArmstrongNo(int n)
	{
		if(ArmstrongNo(n))
			System.out.println(n+" is Armstrong number");
		else
			System.out.println(n+" is not Armstrong number");
	}
	public static boolean ArmstrongNo(int n)
	{
		int l=(int) (Math.log10(n)+1); //counts length of integer
		int sum=0,rem,n1=n;
		for(;n1>0;n1=n1/10)
		{
			sum=(int) (sum+(Math.pow((n1%10), l)));
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void fibonacci(int range)
	{
		int a=1,b=0,c=1;
		for(int i=0;i<=range;i++)
		{
			System.out.print(a+",");
			c=b;
			b=a;
			a=a+c;
		}
		System.out.println();
	}
	public static boolean prime(int n)
	{
		int flag=0,mid;
		if(n==0||n==1)
			return false;
		else if(n==2)
			return true;
		else
		{
			mid=(n/2)+1;
			for(int i=2;i<=mid;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void checkPrime(int n)
	{
		if(prime(2))
		{
			System.out.println(n+" is prime");
		}
		else
			System.out.println(n+" is not prime");
	}
	public static void palindromeNumber(int n)
	{
		String str=Integer.toString(n);
		stringsProgram.stringPalindrome(str);
	}
	public static void primeInRange(int from,int to)
	{
		ArrayList<Integer> lst=new ArrayList<Integer>();
		if(from>to)
		{
			int temp=from;
			from=to;
			to=temp;
		}
		for(int i=from;i<=to;i++)
		{
			if(prime(i))
				lst.add(i);
		}
		for (Integer integer : lst) 
		{
			System.out.print(integer+", ");
		}
	}
	

}
