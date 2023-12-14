import java.util.Scanner;               // java package header file
public class armstrongnumber {          // class name
public static void main(String[] args) {  // main function
int i,n,n1,remainder,sum;                 // declaring values
Scanner sc=new Scanner(System.in);     //Scanner class declaration
System.out.println("enter n values");  // printing values
n=sc.nextInt();                       
for(i=1;i<=n;i++)                      // syntax and declaring the for loop  
{
	n1=i;                              //statements
	sum=0;                             
	while(n1!=0)                       // syntax and declaring while loop
	{
		remainder= n1%10;
		sum=sum+remainder*remainder*remainder;     //statements
		n1=n1/10;
	}
	if(sum==i)                         // syntax and declaring if statement
	{
		System.out.println(i+"\t");    // print statement
	}
    }
	}
    }