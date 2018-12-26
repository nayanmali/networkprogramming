package in.ac.adit.networkpgoramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		InetAddress address;
		try {
			address = InetAddress.getByName("www.stackoverflow.com");
			System.out.println("Ip Address :" + address);
			System.out.println("getHostName :" + address.getHostName());
			System.out.println("getHostAddress :" + address.getHostAddress());
			System.out.println("getLoopbackAddress :" + InetAddress.getLoopbackAddress());
			System.out.println("getCanonicalHostName :" + address.getCanonicalHostName());

			System.out.println("getAddress: "+address.getAddress());
			System.out.println("isSiteLocalAddress: "+address.isSiteLocalAddress());
			System.out.println("isAnyLocalAddress: "+address.isAnyLocalAddress());
			System.out.println("isLoopbackAddress: "+address.isLoopbackAddress());
			System.out.println("isMCGlobal: "+address.isMCGlobal());
			System.out.println("isMCNodeLocal: "+address.isMCNodeLocal());
			
			System.out.println("isSiteLocalAddress: "+address.isSiteLocalAddress());
			System.out.println("isMCOrgLocal: "+address.isMCOrgLocal());
			System.out.println("isLinkLocalAddress: "+address.isLinkLocalAddress());
			System.out.println("isMCLinkLocal: "+address.isMCLinkLocal());
			System.out.println("isMulticastAddress: "+address.isMulticastAddress());
			System.out.println("isReachable: "+address.isReachable(2000));
			System.out.println("isSiteLocalAddress: "+address.isSiteLocalAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
