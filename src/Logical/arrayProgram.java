package Logical;

public class arrayProgram 
{
	static int[] a= {2,3,4,5},c= {23,1,45,78,15,7,0};
	static int[][] b= {{33,14,51},{8,5,67}};
	
	public static void arr1DDisp()
	{
		//System.out.println(b[3]);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
	}
	public static void arr2DDisp()
	{
		int[][][] r = new int[2][2][2];
		r[0][0][0]=12;
		System.out.println(r[0][0][0]);
		//System.out.println(b[3]);
		for(int i=0;i<2;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
				System.out.print(b[i][j]+"\t");
			
		}
		
	}
	public static void findMissingNo()
	{
		int sum=0,arraySum=0;
		int[] arr= {0,7,6,2,1,9,8,3,4,10};
		for(int i=0;i<=10;i++)
		{
			if(i<10)
				arraySum=arraySum+arr[i];
			sum=sum+i;
		}
		int diff=sum-arraySum;
		System.out.println("The Missing number is "+diff);
	}
	public static void findDuplicateNo()
	{
		int[] arr= {0,1,2,4,2,3,5};
		int sum=0,arraySum=0;
		for(int i=0;i<=6;i++)
		{
			if(i<6)
				sum =sum+i;
			arraySum=arraySum+arr[i];
		}
		int diff=arraySum-sum;
		System.out.println("The duplicate number is "+diff);
	}
	public static int[] sortArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		return arr;
	}
	public static void findNumber(int[] arr,int n)
	{
		
		int i,flag=0;
		for(i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{	
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("The Number "+n+" is present in array at index "+i);
		else
			System.out.println("The Number "+n+" is not present in array");
		
	}
	public static void binarySearch(int[] arr,int first,int last,int n)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<n)
			{
				first=mid+1;
			}
			else if(arr[mid]==n)
			{
				System.out.println("Element is found at index = "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
			System.out.println("element not found");
	}
}
