/*
Q6. Implement a java program to find the duplicate elements in an array and print the index of the element found. 
*/
import java.util.*;
class Special
{
    int[] arr=new int[100];
    Scanner sc=new Scanner(System.in);
    void duplicate(int n)
    {
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate element found at index : "+j);
                    a[j]=1;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Special obj=new Special();
        System.out.print("Enter the size of the array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            obj.arr[i]=sc.nextInt();
        }
        obj.duplicate(n);
    }
}