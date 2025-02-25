/*Q1. Create a Java program to simulate a simple banking system where a user can perform the following actions using the Scanner class:
I.	Check Account Balance
II.	Deposit Money
III.	Withdraw Money
IV.	Exit the Program
•	Initially, the account balance is set to Rs10000.
•	Ensure the user input is validated (e.g., preventing withdrawal of an amount greater than the balance or depositing negative amounts).
•	After each action, show the updated balance and ask the user if they want to perform another action.  
*/


import java.util.*;
class Bank
{
    int balance=10000;
    Scanner sc=new Scanner(System.in);
    void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amt=sc.nextInt();
	if(amt<0)
	{
		System.out.println("Amount can not be negative!!!!");
	}
	else
	{
        	balance+=amt;
        	System.out.println("The updated balance is : "+balance);
	}
        
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn : ");
        int amt=sc.nextInt();
	if(amt<0)
	{
		System.out.println("Amount can not be negative!!!!");
	}
        else if(amt>balance)
        {
            System.out.println("The requested amount exceeds the balance!!!");
        }
        else
        {
            balance-=amt;
            System.out.println("The updated balance is : "+balance);
        }
    }
    void check_balance()
    {
        System.out.println("The account balance is : "+balance);
    }
    public static void main(String args[])
    {
        int c;
	Scanner sc=new Scanner(System.in);
	Bank obj=new Bank();
        do 
        {
            System.out.print("PRESS\n1- For depositing\n2-For withdrawal\n3-For checking balance\n4-For exiting\nEnter your choice : ");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.check_balance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!!!! Please enter your choice again");
            }
        }
        while(c!=4);
    }
}