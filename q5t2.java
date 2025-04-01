/*5. Implement a program  in java to count the frequency of each character in a string.
*/

import java.util.*;
class Program
{
	static void occurrence(String str)
	{
		int[] a=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			if(a[i]!=0)
				continue;
			for(int j=i+1;j<str.length();j++)
			{
				if(a[j]==0 && str.charAt(j)==str.charAt(i))
				{
					a[j]=1;
					count++;
				}
			}
			System.out.println("The character "+str.charAt(i)+" appears "+count+" times.");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter the string : ");
		str=sc.nextLine();
		occurrence(str);
	}
}