/*
3.Program to find if the given numbers are Friendly pair or not (Amicable or 
not). Friendly Pair are two or more numbers with a common abundance. 
Input & Output format: 
• Input consists of 2 integers. 
• The first integer corresponds to number 1 and the second integer corresponds to 
number 2. 
• If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair. 
For example,6 and 28 are Friendly Pair. 
(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28. 
Steps  to check whether the given numbers are friendly pair or not 
• Input the numbers num1 and num2. 
• Initialize sum1 = sum2 = 0. 
• sum1 = sum of all divisors of num1. 
• sum2 = sum of all divisors of num2. 
• If (sum1 == num1) and (sum2 == num2), then print "Abundant Numbers". 
• Else, print "Not Abundant Numbers". 
Program to check whether the given numbers are friendly pair or not
*/

import java.util.*;
class Friendly
{
	public static void main(String args[])
	{
		int n1,n2,s1=0,s2=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the two numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
				s1+=i;
		}
		for(int i=1;i<=n2;i++)
		{
			if(n2%i==0)
				s2+=i;
		}
		if(s1>2*n1 && s2>2*n2)
		{
			System.out.println("Abundant Numbers");
		}
		else
		{
			System.out.println("Non-Abundant Numbers");
		}
		if(((double)s1/n1) == ((double)s2/n2))
		{
			System.out.println("Friendly Pair");
		}
		else
		{
			System.out.println("Not Friendly Pair");
		}
	}
}