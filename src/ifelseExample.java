import java.util.Scanner;
public class ifelseExample {
public static void main(String[] args) {
		int experience;
		Scanner din=new Scanner(System.in);
		System.out.println("enter your experience");
		experience= din.nextInt();
		if(experience>=1 && experience<=5)
		{
			System.out.println("you are valid candidate for interview");
		}
		else
		{
			System.out.println("your experience is not valid");
		}
		}
}
