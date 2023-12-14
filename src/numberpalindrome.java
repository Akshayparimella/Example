import java.util.Scanner;    // package name header file
public class numberpalindrome { // class name
	public static void main(String[] args)//main function 
	{
		int number,number1,remainder,reverse=0;
		Scanner sc=new Scanner(System.in);  //scanner class
		System.out.println("enter n values"); // enter n values
		number=sc.nextInt();
		number1=number;
		while(number!=0)        // syntax and declaration of while loop
		{
			remainder= number%10;
			reverse= reverse*10+remainder; //statements
			number= number /10;
		}
		System.out.println(reverse);  
		if(reverse==number1)    //  syntax and declaration of if statement
		{
			System.out.println("number is palindrome");  // print statement
		}
		else                   // else block
		{
			System.out.println("number is not a palindrome"); // print statement
		}
	}
}

