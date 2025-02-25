/*
Q3  A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.
Example:         Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of its digits = 5 x 9 = 45
Sum of the sum of digits and product of digits= 14 + 45 = 59
Implement a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value is equal to the number input, output the message “Special 2-digit number” otherwise; output the message “Not a Special 2-digit number”. 
*/

import java.util.*;
class Special
{
    public static void main(String args[])
    {
        int n,a,b;
        System.out.print("Enter the digit : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n/10;
        b=n%10;
        if((a*b + a+b)==n)
            System.out.println("Special two digit number");
        else
            System.out.println("Not a special two digit number");
    }
}