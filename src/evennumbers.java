import java.util.Scanner;
public class evennumbers {
	public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the n values");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(i%2==0)
{
System.out.println(i+"\t");
}
}
}
}

