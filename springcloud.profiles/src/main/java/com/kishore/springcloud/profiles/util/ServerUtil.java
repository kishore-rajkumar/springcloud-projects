package com.kishore.springcloud.profiles.util;
import java.net.InetAddress;

public class ServerUtil {
	
	public static String getHostName() {
		String hostname = null;
		InetAddress localhost=null;
		
		try {
            // Get the InetAddress object representing the localhost
            localhost = InetAddress.getLocalHost();

            // Get the hostname
            hostname = localhost.getHostName();

            System.out.println("Hostname of the server: " + hostname);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
		return localhost.getHostAddress().concat("; ").concat(hostname);
		
	}
  
}
