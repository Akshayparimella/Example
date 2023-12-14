import java.util.Scanner;               // java package header file
public class floodytriangle {           // class name
public static void main(String[] args) { // main function
				int i,j,n,a=1;           // variable declaration
				Scanner din = new Scanner(System.in);  // scanner class
				System.out.println("Enter Nth Term");  // print statement
				n=din.nextInt();
				for(i=1;i<=n;i++)		// Outer Loop i
				{
					for(j=1;j<=i;j++)		// Inner Loop j
					{
						System.out.print("*");  //statements
						a=a+1;                  //incrementing value
					}
					System.out.println();        // print statements
				}
                }
                } 

