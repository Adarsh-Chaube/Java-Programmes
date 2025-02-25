/*
Q4 Implement a Java Program to input any string and count the Number of  Occurrence of each Character. Also count number of vowels, number of  uppercase, number of lowercase, number of digit and number of characters   in a given string    
*/
import java.util.*;
class Special
{
    String str;
    Scanner sc=new Scanner(System.in);
    void occurence()
    {
        int n=str.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=1;
            if(arr[i]!=0)
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    arr[j]=1;
                    c++;
                }
            }
            System.out.println("Character  "+str.charAt(i) +"  appears "+c+" times.");
        }
    }
    void count()
    {
        int nv=0,nu=0,nl=0,nd=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
            {
                nv++;
            }
            if(c>='A' && c<='Z')
                nu++;
            if(c>='a' && c<='z')
                nl++;
            if(c>='0' && c<='9')
                nd++;
        }
        System.out.println("No. of vowels : "+nv);
        System.out.println("No. of uppercase characters : "+nu);
        System.out.println("No. of lowercase characters : "+nl);
        System.out.println("No. of digits : "+nd);
        System.out.println("No. of characters : "+(nu+nl));
    }
    public static void main(String args[])
    {
        Special obj=new Special();
	System.out.print("Enter the string : ");
	Scanner sc=new Scanner(System.in);
	obj.str=sc.nextLine();
	obj.occurence();
	obj.count();
    }
}