import java.util.Scanner;
public class foreachloop {
public static void main(String[] args) {
String name[]={"sjhdjsk","jhhks","njsjje"};
int n=name.length;
for(int i=0;i<n;i++)
{
	System.out.println(name[i]);
	if(name[i].equals("sjhdjsk"))
	{
		System.out.println("yes");
		}
}
for(String list:name)
	{
	System.out.println(list);
if(list.equals("sjhdjsk"))
{
	System.out.println("yes");
}
}
}
}





 


	
