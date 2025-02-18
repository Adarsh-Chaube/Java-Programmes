/*Write a java program to take input as a command line argument. Your name, course, university rollno and semester. Display the information. 
 
       Name: 
       UniversityRollNo: 
       Course: 
       Semester:
*/
import java.util.*;
class Details
{
	public static void main(String args[])
	{
		System.out.println("Name : "+args[0]+"\nUniversity Roll no. : "+args[1]+"\nCourse : "+args[2]+"\nSemester : "+args[3]);
	}
}
//C:\Users\lenovo\Desktop\c_codes\sem4\Java>javac q1.java
/*
C:\Users\lenovo\Desktop\c_codes\sem4\Java>java Details Adarsh 2000001 B.Tech 4
Name : Adarsh
University Roll no. : 2000001
Course : B.Tech
Semester : 4
*/