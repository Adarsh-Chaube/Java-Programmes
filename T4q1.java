/*
1.Write a java program to create a class named 'Bank ' with the following data 
members:
Name of depositor
Address of depositor
Account Number
Balance in account
Class 'Bank' has a method for each of the following: 
1 - Generate a unique account number for each depositor
For first depositor, account number will be 1001, for second depositor it will be 1002 and 
so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, account number, balance) of the depositors. 
Number of depositors is to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final information 
of that depositor
4 - Remove some amount from the account of any depositor and then display final 
information of that depositor
5 - Change the address of any depositor and then display the final information of that 
depositor
6 - Randomly repeat these processes for some other bank accounts.

*/
import java.util.*;
class Bank
{
    String name,add;
    static int acn=1000;
    int balance,accn;
    Scanner sc=new Scanner(System.in);
    Bank()
    {
        acn++;
        accn=acn;
        System.out.print("Enter Name, Address and balance in the account respectively : ");
        name=sc.nextLine();
        add=sc.nextLine();
        balance=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name : "+name+"\nAddress : "+add+"\nAccount no. : "+accn+"\nBalance : "+balance);
    }
    void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amt=sc.nextInt();
        balance+=amt;
        System.out.println("Updated balance : "+balance);
    }
    void withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
        int amt=sc.nextInt();
        if(balance<amt)
            System.out.println("The amount exceeds balance!!!!");
        else
            balance-=amt;
        System.out.println("Updated balance : "+balance);
    }
    void change_address()
    {
        System.out.print("Enter the new address : ");
        sc.nextLine();
        String str=sc.nextLine();
        this.add=str;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of depositors : ");
        n=sc.nextInt();
        Bank[] arr=new Bank[n];
        System.out.println("Enter the data of the depositors : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=new Bank();
        }
        System.out.print("Enter the depositor number for performing operations : ");
        int a=sc.nextInt()-1;
        arr[a].display();
        arr[a].deposit();
        arr[a].withdraw();
        arr[a].change_address();
        arr[a].display();
    }
}