import java.util.Scanner;         // java package header file
public class stringreverse {      //class name
	public static void main(String[] args) { // main function
	String first,second="";                 // string ""
	char ch;                                // char 
	Scanner sc=new Scanner(System.in);      // scanner class
	System.out.println("enter n values");   // enter values
	first=sc.next();
	for(int i=first.length()-1;i>=0;i--)     // syntax and declaration of for loop
	{
		ch=first.charAt(i);                   // statements
		second=second+ch;
	}
	if(first.equals(second))                 // syntax and declaration of if statements
	{
	System.out.println("String is palindrome");     // print statements
	}
	else                                           // else statement
	{
		System.out.println("String is not a palindrome"); // print else statement when condition is not satisfy
	}
	}
    }
