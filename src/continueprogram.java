import java.util.Scanner;
public class continueprogram {
	public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter n values");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
if(i==5)
{
	continue;
}
	System.out.println(i);
}
}
}


