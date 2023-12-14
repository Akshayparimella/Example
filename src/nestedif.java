import java.util.Scanner;
public class nestedif {
	public static void main(String args[])
	{
		int age,exp;
		String degree;
		Scanner din= new Scanner(System.in);
		System.out.println("enter your age");
		age=din.nextInt();
		if(age>=20 && age<=40)
		{
			System.out.println("enter your degree");
			degree=din.next();
			if(degree.equalsIgnoreCase("b-tech") || degree.equalsIgnoreCase("m tech"))
					{
				System.out.println("enter your experience");
				exp=din.nextInt();
				if(exp>=1 && exp<=5)
				{
					System.out.println("dear candidate .. you're shortlisted for the interview");
				}
				else
				{
					System.out.println("sorry !! you're experience is not valid");
					}
					}
				else
					{
					System.out.println("sorry !! you're degree is not valid");
				}
		        }
		       else
				{
					System.out.println("sorry !! you're age is not valid");
				}
	            }
                }




	
		
	    
	
	
	
					
				
					
		
				
	

	


