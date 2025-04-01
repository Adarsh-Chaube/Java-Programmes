/*
1. Implement a Program to find all the patterns of 0(1+)0 in the given string. Given a string containing 0's and 1's, find the total number of 0(1+)0 patterns in the string and output it.
0(1+)0 - There should be at least one '1' between the two 0's.
For example, consider the following string.
Input: 01101111010
Output: 3
Explanation:
01101111010 - count = 1
01101111010 - count = 2
01101111010- count = 3

Step to find all the patterns of 0(1+)0 in the given string
•	Input the given string.
•	Scan the string, character by character.
•	If the given pattern is encountered, increment count.
•	Print count.

*/
import java.util.*;
class Test
{
    String str;
    void count()
    {
        int c=0,s=0,e=0;
        for(int i=0;i<str.length();i++)
        {
            if(s==0 && str.charAt(i)=='0')
            {
                s=1;
            }
            else if(str.charAt(i)=='0')
            {
                if(str.charAt(i-1)=='1')
                {
                    c++;
                    i--;
                    s=0;
                }    
            }
        }
        System.out.println("The number of such patterns in the string are : "+c);
    }
    public static void main(String args[])
    {
        Test obj=new Test();
        System.out.print("Enter the string of 0s and 1s : ");
        Scanner sc=new Scanner(System.in);
        obj.str=sc.nextLine();
        obj.count();
    }
}