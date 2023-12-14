import java.util.Scanner;
public class forloop{
public static void main(String[] args) {
	String username,password;
   	int attempts=3;
	Scanner din= new Scanner(System.in);
	System.out.println("enter you username");
	username=din.next();
	if(username.equals("akshay"))
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("enter your password");
			password=din.next();
		if(password.equals("akshay@123"))
		{
			System.out.println("welcome" + username);
			break;
        }
		else
		{
	    attempts--;
			if(attempts==0)
			{
				System.out.println("your account is locked please contact your administration branch");
			break;
			}
			System.out.println("password is not valid");
			System.out.println("you have remaining attempts"+ attempts);
		}
		}
		}
	}
}

	


		   
    
	
	
	
