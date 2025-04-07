import java.util.*;
class MyRectangle
{
    int length,width;
    void setData()
    {
        System.out.print("Enter the value of length and width respectively : ");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        width=sc.nextInt();
    }
    int rectArea()
    {
        return length*width;
    }
    public static void main(String args[])
    {
        MyRectangle obj=new MyRectangle();
        obj.setData();
        int area=obj.rectArea();
        System.out.println("Area of the rectangle is : "+area);
    }
}