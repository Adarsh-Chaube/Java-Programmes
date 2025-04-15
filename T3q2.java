/*
2. Implement  a Java program that defines a class Book with the following properties:
•	title (String)
•	author (String)
•	price (double)
Create an array of Book objects and populate it with at least 5 books. Then, implement the following functionalities:
1.	Display the details of all books in the array.
2.	Find the book with the highest price and display its details.
3.	Find the total price of all the books in the array.
4.	Display all the books written by a specific author (given as input).

*/
import java.util.*;
class Book
{
    String author,title;
    double price;
    Scanner sc=new Scanner(System.in);
    Book()
    {
        System.out.print("Enter the title, author name and price of the book respectively : ");
        title=sc.nextLine();
        author=sc.nextLine();
        price=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Title : "+title+"\nAuthor : "+author+"\nPrice : "+price+"\n");
    }
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter the no. of books : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Book[] arr= new Book[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Book();
        }
        System.out.println("The details of the books are as follows : ");
        for(int i=0;i<n;i++)
        {
            arr[i].display();
        }
        double h=0;
        Book o=arr[0];
        for(Book obj:arr)
        {
            if(obj.price>h)
            {
                h=obj.price;
                o=obj;
            }    
        }
        System.out.println("The book with the highest price is : ");
        o.display();
        double t=0;
        for(Book obj:arr)
        {
            t+=obj.price;
        }
        System.out.println("The total price of the books is : "+t);
        System.out.print("Enter the author whose books are to be found : ");
	sc.nextLine();
        String str=sc.nextLine();
	System.out.println("The books of the author   "+str+"    are : ");
        for(Book obj : arr)
        {
            if(obj.author.equals(str))
                obj.display();
        }

    }
}