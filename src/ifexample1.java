import java.util.Scanner;
public class ifexample1 {
public static void main(String[] args) {
int age;
Scanner din =new Scanner(System.in);
System.out.println("enter candidate age");
age=din.nextInt();
if(age>=18)
{
	System.out.println("candidate is eligible for vote");
}
}
}

