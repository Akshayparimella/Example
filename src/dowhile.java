import java.util.Scanner;
public class dowhile {
public static void main(String[] args) {
String money="yes";
do
{
	if(money.equals("no"))
	{
		System.out.println("go to kitchen and cut vegetables");
	break;
	}
	System.out.println("menu is avaliable here");
	Scanner din=new Scanner(System.in);
	System.out.println("do you have money");
	money=din.next();
}
while(money.equals("no"));
}
}


