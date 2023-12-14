import java.net.InetAddress;
import java.net.UnknownHostException;


public class Example11 {

	public static void main(String[] args) {
		try {
			InetAddress verify =InetAddress.getLocalHost();
			System.out.println(verify);
			System.out.println(verify.getHostName());
			System.out.println(verify.getHostAddress());
			System.out.println(verify.getByName("www.facebook.com"));
		} catch (Exception e) {
		     e.printStackTrace();
		}
		}
	}
