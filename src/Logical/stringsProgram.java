package Logical;

public class stringsProgram 
{
	public static String s1,s2,s3;

	public static void stringAnagram(String first,String second)
	{
		int flag=0;
		if(first.length()==second.length())
		{
			for(int i=first.length()-1;i>=0;i--)
			{
				String ch="";
				ch=ch+first.charAt(i);
				if(second.contains(ch))
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}	
			}
		}
		else
		{
			flag=1;
		}
		if(flag==0)
			System.out.println("Strings are ANAGRAM");
		else
			System.out.println("Strings are NOT ANAGRAM");
		
	}
	public static String stringReverse(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
		return rev;
			
	}
	public static void stringPalindrome(String str)
	{
		String rev=stringReverse(str);
		if(rev.equals(str))
			System.out.println(str+" is PALINDROME");
		else
			System.out.println(str+" is NOT PALINDROME");
	}
	public static String Reverse(String str)
	{
		s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);
		}
		return s1;
	}
	public static String charAtOdd(String str)
	{
		s1="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
				s1=s1+str.charAt(i);
		}
		return s1;
	}
	public static String charAtEven(String str)
	{
		s1="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==1)
				s1=s1+str.charAt(i);
		}
		return s1;
	}
	public static String reverseOddWord(String str)
	{
		s1="";
		String[] ar=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				s1=s1+Reverse(ar[i])+" ";
			}
			else
				s1=s1+ar[i]+" ";
		}
		return s1;
	}
	public static String reverseEvenWord(String str)
	{
		s1="";
		String[] ar=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==1)
			{
				s1=s1+Reverse(ar[i])+" ";
			}
			else
				s1=s1+ar[i]+" ";
		}
		return s1;
	}
	public static String displayAlphabateOnly(String str)
	{
		return str.replaceAll("[^a-z,A-Z]", "");
	}
	public static String displayNumericsOnly(String str)
	{
		return str.replaceAll("[^0-9]", "");
	}
	public static void stringBasics()
	{
		s2="APOcalyPTO";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.indexOf('O'));
		System.out.println(s2.lastIndexOf('O'));
		System.out.println(s2.startsWith("p",7));
		System.out.println(s2.endsWith("TO"));
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(2, 7));
		System.out.println(s2.subSequence(2, 7));
		s3="ABCD";
		s1="abcd";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		s1="cal";
		System.out.println(s2.contains(s2));
		String[] ar=s2.split("c");
		System.out.println(ar[0]);
		String[] ar1=s2.split("c", 2);
		System.out.println(ar1[1]);
		
		//System.out.println(s2.replaceAll("[^A,a]", "1"));
		s2=s1.concat(s3);
		System.out.println(s2);
	}

}
