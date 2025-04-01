/*
3. Define a class WordExample having the following description:
Data members/instance variables:
private String strdata : to store a sentence.
Parameterized Costructor
WordExample(String) : Accept a sentence which may be terminated by either’.’, ‘? ’or 
’!’ only. The words may be separated by more than one blank space and are in UPPER 
CASE.
Member Methods:
void countWord(): Find the number of words beginning and ending with a vowel.
void placeWord(): Place the words which begin and end with a vowel at the beginning, 
followed by the remaining words as they occur in the sentence
*/
import java.util.*;
class WordExample
{
    private String strdata;
    WordExample(String str)
    {
        if(".?!".indexOf(str.charAt(str.length()-1))==-1)
        {
            System.out.println("Doesn't terminate with !,? or. and hence is invalid string.");
        }
        else if(!str.equals(str.toUpperCase()))
            System.out.println("INVALID String as all letters are not uppercase.");
        else
            strdata=str;
    }
    void countWords()
    {
        String[] words=strdata.split("[\\s!.?]+");
        int c=0;
        for(String a: words)
        {
            if("AEIOU".indexOf(a.charAt(0))!=-1 && "AEIOU".indexOf(a.charAt(a.length()-1))!=-1)
                c++;
        }
        System.out.println("No. of Words starting and ending with vowels are : "+c);
    }
    void placeWord()
    {
        String[] words=strdata.split("[\\s!.?]+");
        String str="";
        for(String a: words)
        {
            if("AEIOU".indexOf(a.charAt(0))!=-1 && "AEIOU".indexOf(a.charAt(a.length()-1))!=-1)
                str+=a+" ";
        }
        for(String a:words)
        {
            if(str.indexOf(a+" ")==-1)
                str+=a+" ";
        }
        System.out.println("The string after placing words beginning and ending with vowels at front is : "+str);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();

        WordExample obj=new WordExample(str);
        if(obj.strdata!=null)
        {
            obj.countWords();
            obj.placeWord();
        }
    }
}