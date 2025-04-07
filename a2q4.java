import java.util.*;
class Bank
{
    String name,type;
    int accno;
    float balance;
    Scanner sc=new Scanner(System.in);
    Bank()
    {
        System.out.println("Enter the name, account no., type of account and balance respectiveyl : ");
        name=sc.nextLine();
        accno=sc.nextInt();
        sc.nextLine();
        type=sc.nextLine();
        balance=sc.nextFloat();
    }
    float deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        float amt=sc.nextFloat();
        return balance+amt;
    }
    float withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
        float amt=sc.nextFloat();
        if(balance>=amt)
            return balance-amt;
        System.out.println("Amount exceeds balance and can not be withdrawn!!!!");
        return balance;
    }
    void display()
    {
        System.out.println("Name of account holder : "+name+"\n Balance : "+balance);
    }
    public static void main(String args[])
    {
        Bank obj=new Bank();
        obj.balance=obj.deposit();
        obj.balance=obj.withdraw();
        obj.display();
    }
}