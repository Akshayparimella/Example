import java.util.Scanner;
public class Allprograms {
public static void main(String[] args) {
int n,i,j,count,a=1,b,c,fact=1,aa=1,n1,sum;
int number,number1,remainder,reverse=0;
int p,q=0,r,x,bin=1;
String choice="y";
String option;
String first,second="";
char ch;
Scanner sc=new Scanner(System.in);
while(choice.equalsIgnoreCase("y"))
{
	System.out.println("*** All Logic Programs ***");
	System.out.println("1. Even Number Program Generation-even");
	System.out.println("2. Odd  Number Program Generation-odd");
	System.out.println("3. Prime Number Program Genration-prime");
	System.out.println("4. Fibonacci Series Generation-fibo");
	System.out.println("5. Factorial Number Generation-fact");
	System.out.println("6. Flody Triangle-flody");
	System.out.println("7. Pascal Triangle-pascal");
    System.out.println("8. Leap Year Generation-leap");
    System.out.println("9. String Palindrome-str");
    System.out.println("10. Number Palindrome-num");
	System.out.println("11. Armstrong number-arm");
	System.out.println(" please enter your operation word ");
	option=sc.next();
    switch(option)
    {
    case "even":
    	System.out.println("Even Number Operation");
    	System.out.println(" enter n value");
    	n=sc.nextInt();
    	for(i=1;i<n;i++)
    	{
    	if(i%2==0)
    	{
    	System.out.println(i+"\t");
    	}
    }
    	break;
    case "odd":
    {
    	System.out.println("Odd Number Operation");
    	System.out.println("enter n values");
    	n= sc.nextInt();
    	for(i=1;i<=n;i++)
    	{
    		if(i%2==1)
    		{
    			System.out.println(i+"  ");
    		}
            }
    }
    	break;
    	case "prime":
    	{
    		System.out.println("Prime Number Operation");
    		System.out.println("enter n values");
    		n=sc.nextInt();
    		for(i=1;i<n;i++)
    		{
    			count=0;
    			for(j=1;j<=i;j++)
    			{
    				if(i%j==0)
    			count++;
    			}
    			if(count==2)
    			{
    				System.out.println(i+"\t");
    			}
    			}
    	        }
    		break;
    	case "fibo":
    	{
    		System.out.println("Fibonacii Series operation");
    		System.out.println("enter n values");
    		n=sc.nextInt();
    		a=0;
    		b=1;
    		for(i=0;i<n;i++)
    			{
    				c=a+b;
    				System.out.println(c+" ");
    				a=b;
    				b=c;
    			}
    		    }
    	break;
    	case "fact":
    	{
    		System.out.println("Factorial Opeeration");
    		System.out.println("Enter Number");
    		n=sc.nextInt(); // 6
    		for(i=1;i<=n;i++) //using for loop
    		{
    			fact = fact * i;      //statements
    		}
    		System.out.println("Factorial Program " + fact);
    	}
    	break;
    	case "flody":
    	{
    		System.out.println("Flody Operation");
    		System.out.println("Enter Nth Term");
			n=sc.nextInt();
			for(i=1;i<=n;i++)		// Outer Loop
			{
				for(j=1;j<=i;j++)		// Inner Loop
				{
					System.out.print(" a");
					a=a+1;
				}
				System.out.println();
			}
            }
    	break;
    	case "pascal":
    	{
    		System.out.println("Pascal Triangle Operation");
    		System.out.println("Enter Nth Term of Rows");
    		p=sc.nextInt(); // 4
    		while(q<p)  // 0 < 4
    		{
    			for(r=30-3*q;r>0;r--) // creating space
    			{
    				System.out.print(" ");
    			}
    			for(x=0;x<=q;x++) // Process
    			{
    				if(x==0)
    				{
    					bin=1;
    				}
    				else
    				{
    					bin=bin*(q-x+1)/x;
    				}
    				System.out.print("*     ");
    			}
    			++q;
    			System.out.println();
    		}
    	}
    	break;
    	case "leap":
    	{
    		System.out.println("Leap Year Operation");
    		System.out.println("enter n values");
    		n=sc.nextInt();
    		for(i=2000;i<=n;i++)
    		{
    			if(i%4==0 && i%100!=0 || i%400==0)
    			{
    				System.out.println(i+" ");
    			}
    		}
            }
    	break;
    	case "str":
    	{
    		System.out.println("String Palindrome");
    		System.out.println("enter n values");
    		first=sc.next();
    		for(i=first.length()-1;i>=0;i--)
    		{
    			ch=first.charAt(i);
    			second=second+ch;
    		}
    		if(first.equals(second))
    		{
    		System.out.println("String is palindrome");
    		}
    		else
    		{
    			System.out.println("String is not a palindrome");
    		}
    	    }
    	break;
    	case "num":
    	{
    		System.out.println("Number Palindrome");
    		System.out.println("enter n values");
    		number=sc.nextInt();
    		number1=number;
    		while(number!=0)
    		{
    			remainder= number%10;
    			reverse= reverse*10+remainder;
    			number= number /10;
    		}
    		System.out.println(reverse);
    		if(reverse==number1)
    		{
    			System.out.println("number is palindrome");
    		}
    		else
    		{
    			System.out.println("number is not a palindrome");
    		}
    	}
    	break;
    	case "arm":
    	{
    		System.out.println("Armstrong Number Operation");
    		System.out.println("enter n values");
    		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
    			n1=i;
    			sum=0;
    			while(n1!=0)
    			{
    				remainder= n1%10;
    				sum=sum+remainder*remainder*remainder;
    				n1=n1/10;
    			}
    			if(sum==i)
    			{
    				System.out.println(i+"\t");
    			}
    		    }
    			}
    	break;
    default:
    	System.out.println("Operation word is not matched");
    }
    System.out.println("\nDo You Want to continue press y or Exit Press Any Key" );
    choice =sc.next();
}
System.out.println("See you !!! Bye");
}
}
    


