package in.ac.adit.networkpgoramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
	public static void main(String[] args) {
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			System.out.println("Ip Address :" + address);
			System.out.println("getHostName :" + address.getHostName());
			System.out.println("getHostAddress :" + address.getHostAddress());
			System.out.println("getLoopbackAddress :" + address.getLoopbackAddress());
			System.out.println("getCanonicalHostName :" + address.getCanonicalHostName());

			System.out.println("\n\n\n\n");

			address = InetAddress.getByName("www.facebook.com");
			System.out.println("Ip Address :" + address);
			System.out.println("getHostName :" + address.getHostName());
			System.out.println("getHostAddress :" + address.getHostAddress());
			System.out.println("getLoopbackAddress :" + address.getLoopbackAddress());
			System.out.println("getCanonicalHostName :" + address.getCanonicalHostName());

			System.out.println("\n\n\n List");

			try {
				InetAddress[] addresses = InetAddress.getAllByName("stackoverflow.com");
				for (int i = 0; i < addresses.length; i++) {
					System.out.println(addresses[i]);
				}
			} catch (UnknownHostException e) {
				System.out.println("Could not find www.stackoverflow.com");
			}

			System.out.println("\n\n\n List");

			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
