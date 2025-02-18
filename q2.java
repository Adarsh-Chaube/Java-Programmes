/*
Using the switch statement, write a menu-driven program to calculate the 
maturity amount of a bank deposit. 
The user is given the following options: 
(i) Term Deposit 
(ii) Recurring Deposit 
 
For option (i) accept Principal (p), rate of interest (r) and time period in years 
(n). Calculate and outpute the maturity amount (a) receivable using the formula 
a = p*[1 + r / 100]*n. 
 
For option (ii) accept monthly installment (p), rate of interest (r) and time period 
in months (n). Calculate and output the maturity amount (a) receivable using the 
formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12. 
For an incorrect option, an appropriate error message should be displayed. 
[ Use Scanner Class to take input ] 
*/
import java.util.*;
class Bank
{
	public static void main(String args[])
	{
		int c,p,roi,t;
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press  !  for Term Deposit\nPress  2  for Recurring Deposit\nEnter your choice : ");
		c=sc.nextInt();
		switch(c)
		{
			case(1):
				System.out.println("Enter principal, rate of interest and time period : ");
				p=sc.nextInt();
				roi=sc.nextInt();
				t=sc.nextInt();
				a=p*(1+roi/100)*t;
				System.out.println("Amount : "+a);
				break;
			case(2):
				System.out.println("Enter principal, rate of interest and time period : ");
				p=sc.nextInt();
				roi=sc.nextInt();
				t=sc.nextInt();
				a= p * t + p * t*(t + 1) / 2 * roi / 100 * 1 / 12.0;
				System.out.println("Amount : "+a);
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}