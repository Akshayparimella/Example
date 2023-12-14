import java.util.Scanner;
public class dowhileprogram {
public static void main(String[] args) {

String money="yes";
do
{
	System.out.println("food menu is avaliable here");
	Scanner din=new Scanner(System.in);
	System.out.println("do you have money");
	money= din.next();
}while(money.equals("yes"));
}
}