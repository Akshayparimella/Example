import java.net.InetAddress;
import java.net.UnknownHostException;
public class Exp {
public static void main(String[] args) {
		try {
			InetAddress check =InetAddress.getLocalHost();
			System.out.println(check);
			System.out.println(check.getHostName());
			System.out.println(check.getHostAddress());
			System.out.println(check.getByName("www.youtube.com"));
			System.out.println(check.getByName("www.google.com"));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
        }
        }
