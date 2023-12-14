import java.util.Scanner;
public class stringbuilder {
	public static void main(String[] args) {
String original= "mom";
StringBuilder data= new StringBuilder(original);
StringBuilder check= data.reverse();
if(original.equals(String.valueOf(check)))
{
	System.out.println("String is palindrome");
	}
else
{
	System.out.println("String is not a palindrome");
}
}
}
