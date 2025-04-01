/*
2 Implement a program in java to find the occurrence of the element appearing maximum  times the array.
Typical Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Typical Output: 4
*/

import java.util.*;
class Program
{
	void occurrence(int[] arr)
	{
		int[] a=new int[arr.length];
		int max_count=0,element=0;
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
			if(count>max_count)
			{
				max_count=count;
				element=arr[i];
			}
		}
		System.out.println("Element appearing maximum times : "+element);
		System.out.println("Maximum frequency : "+max_count);
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
	}
}
