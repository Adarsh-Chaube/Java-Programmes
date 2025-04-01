/*
3.Implement a program that finds the subarray with the largest sum in a given array. 
Typical Input: [1, -2, 3, 4, -1, 2, 1, -5, 4]
Typical Output: 9 (subarray [3, 4, -1, 2, 1])
*/

import java.util.*;
class Program
{
	public static void main(String[] args)
	{
		System.out.print("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter the elements of the array : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum to be obtained : ");
		int target=sc.nextInt();
		int j,sum=0,i;
		for(i=0;i<n;i++)
		{
			sum=arr[i];
			for(j=i+1;j<n;j++)
			{
				sum+=arr[j];
				if(sum==target)
					break;
			}
			if(sum==target)
			{
				System.out.println("The sub array is : ");
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+"   ");
				}
				break;
			}
		}
		if(sum!=target)
			System.out.println("No sub array with the target sum found!!!!"); 
	}
}