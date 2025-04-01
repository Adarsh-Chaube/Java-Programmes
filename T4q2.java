/*
2.Demonstrate Constructor overloading in java with the help of a java code.
*/
import java.util.*;
class Test
{
    int numerator,denominator;
    Scanner sc=new Scanner(System.in);
    Test()
    {
        this(35);
    }
    Test(int num)
    {
        this(num,20);
    }
    Test(int num,int denom)
    {
        numerator=num;
        denominator=denom;
    }
    void divide()
    {
        System.out.println(numerator+" / "+denominator+" = "+(float)numerator/denominator);
    }
    public static void main(String args[])
    {
        Test ob1=new Test();
        Test ob2=new Test(10);
        Test ob3=new Test(15,4);
        ob1.divide();
        ob2.divide();
        ob3.divide();
    }
}