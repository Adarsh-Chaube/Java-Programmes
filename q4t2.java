/*
4. Implement a java program to delete vowels from given string using String and  StringBuffer class.
*/

import java.util.*;
class Program
{
	static void remove_String(String str)
	{
		str=str.replaceAll("[AEIOUaeiou]","");
		System.out.println("String after removing vowel using String is : "+str);
	}
	static StringBuffer remove_String_Buffer(String str)
	{
		StringBuffer s=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if("AEIOUaeiou".indexOf(str.charAt(i))==-1)
			{
				s.append(str.charAt(i));
			}
		}
		return s;
	}
	public static void main(String args[])
	{
		String str;
		System.out.print("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		remove_String(str);
		System.out.println("String after removing vowel using StringBuffer is : "+remove_String_Buffer(str));
	}
}