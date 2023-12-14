import java.util.Scanner;
public class fibonaciiseries {
public static void main(String[] args) {
int a,b,c,i,n;
Scanner sc=new Scanner(System.in);
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
    }
    
