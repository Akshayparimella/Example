import java.util.Scanner;
public class ladderifexample2 {
public static void main(String[] args) {
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("enter 3 numbers");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x>y && x>z)
{
	System.out.println("x is bigger number");
}
else if(y>z)
{
	System.out.println("y is bigger number");
	}
else
{
	System.out.println("z is bigger number");
	}
	}
    }
