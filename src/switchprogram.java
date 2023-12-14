import java.util.Scanner;
public class switchprogram {
	public static void main(String[] args) {
		int option;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your option");
		option=ss.nextInt();
		switch(option)
		{
		case 1: System.out.println("statement1");
			break;
		case 2: System.out.println("statement2");
			break;
			default:
				System.out.println("sorry !! invlid option");
		}
		}
        }


