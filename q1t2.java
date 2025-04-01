/*
1. Implement a program in java to
•	Count the Occurrences of Each Element in an Array
•	 find the second largest element in an array
*/

import java.util.*;
class Program
{
	void sec_largest(int[] arr)
	{
		int max=arr[0],sm=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				sm=max;
				max=arr[i];
			}
			else if(sm<arr[i])
			{
				sm=arr[i];
			}
		}
		System.out.println("\n\nThe second largest element is  : "+sm);
	}
	void occurrence(int[] arr)
	{
		int[] a=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(a[i]!=0)
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(a[j]==0 && arr[j]==arr[i])
				{
					a[j]=1;
					count++;
				}
			}
			System.out.println("The element "+arr[i]+" occurs "+count+" times.");
		}
	}
	public static void main(String[] args)
	{
		Program obj=new Program();
		System.out.print("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter the elements of the array : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.occurrence(arr);
		obj.sec_largest(arr);
	}
}