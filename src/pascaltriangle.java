import java.util.Scanner;   // java package header file
public class pascaltriangle {  // class name
public static void main(String[] args) {  //main function
		int p,q=0,r,x,bin=1;              // values declaring
		Scanner din = new Scanner(System.in); // scanner class
		System.out.println("Enter Nth Term of Rows"); // enter n rows
		p=din.nextInt(); // 4
		while(q<p)  // 0 < 4   while loop 
		{
			for(r=30-3*q;r>0;r--) // creating space for loop
			{
				System.out.print(" ");
			}
			for(x=0;x<=q;x++) // Process for loop
			{
				if(x==0)      // if statements
				{
					bin=1;    // statements
				}
				else         // else block
				{
					bin=bin*(q-x+1)/x;  // statements
				}
				System.out.print("*     ");
			}
			++q;
			System.out.println(); // print statement
		}
	}

}




