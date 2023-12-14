import java.util.*;
public class faculty {
int facid;
String facname;
String designation;
double salary;
void getdata()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter faculty id");
	facid = sc.nextInt();
	System.out.println("enter faculty name");
	facname = sc.next();
	System.out.println("enter faculty designtion");
	designation =sc.next();
	System.out.println("enter faculty salary");
	salary = sc.nextDouble();
	sc.close();
}
void printdata()
{
	System.out.println("faculty id"+ facid);
	System.out.println("faculty name"+ facname);
	System.out.println("designation="+ designation);
	System.out.println("salary="+ salary);
}
public static void main(String[] args) {
faculty f1=new faculty();
f1.getdata();
f1.printdata();
}

}
