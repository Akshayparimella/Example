import java.util.Scanner; // package name header file
public class leapyear {   // class name
public static void main(String[] args) // main function 
{
int i,n;
Scanner sc=new Scanner(System.in);  //scanner class
System.out.println("enter n values");// enter n values
n=sc.nextInt();
for(i=2000;i<=n;i++)// for loop
{
	if(i%4==0 && i%100!=0 || i%400==0)// if statement
	{
		System.out.println(i+" ");    // print statement
	}
    }
	}
    }
    
