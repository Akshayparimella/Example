import java.util.Scanner;
public class student
{
int sid;
String sname;
String department;
void getinfo()
{
	Scanner din=new Scanner(System.in);
	System.out.println("enter student id");
	sid=din.nextInt();
	System.out.println("enter student name");
	sname=din.next();
	System.out.println("enter student department");
	department=din.next();
}
void getdata()
{
	System.out.println("student id"+ sid);
	System.out.println("student name"+ sname);
	System.out.println("student department"+ department);
}
public static void main(String args[])
{
	student s= new student();
	s.getinfo();
	s.getdata();
}		

	}


