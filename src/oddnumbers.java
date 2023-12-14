import java.util.Scanner;
public class oddnumbers {
public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
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
}








