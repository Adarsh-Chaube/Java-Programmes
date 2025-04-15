import java.util.*;
class Employee
{
	int emp_id,dep_id;
	String name;
    Scanner sc=new Scanner(System.in);
	Employee()
	{
        try
        {
            System.out.print("Enter name : ");
            String n=sc.nextLine();
            if(!(n.charAt(0)>='A' && n.charAt(0)<='Z'))
                throw new ArithmeticException("First letter of name must be capital!!!");
            else
                name=n;
            System.out.print("Enter employee id : ");
            int e=sc.nextInt();
            if(e>=2001 && e<=5001)
                emp_id=e;
            else
                throw new ArithmeticException("Employee id must be between 2001 and 5001");
            System.out.print("Enter department id : ");
            e=sc.nextInt();
            if(e>=1 && e<=5)
                emp_id=e;
            else
                throw new ArithmeticException("Department id must be between 1 and 5.");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
	}
    public static void main(String args[])
    {
        Employee obj=new Employee();
    }
}