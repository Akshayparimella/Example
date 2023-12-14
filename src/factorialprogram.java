import java.util.Scanner;        // java package header file
public class factorialprogram {  //class name
public static void main(String[] args)  //main function 
{
	int i,n,fact=1;                    // variable declaration
	Scanner din = new Scanner(System.in); //using Scanner class
    System.out.println("Enter Number");   // printing numbers
		n=din.nextInt(); // 6
		for(i=1;i<=n;i++) //using for loop i 
		{
			fact = fact * i;      // factorial declaration fact*i 
		}
		System.out.println("Factorial Program " + fact);
	}
}
