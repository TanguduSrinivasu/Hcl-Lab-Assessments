package com.main;

import java.util.Scanner;

import com.pojo.Ipaddress;

public class IpaddressMain {
	public static void main(String[] args) {
		System.out.println("Enter the IpAddress");
		Scanner scanner = new Scanner(System.in);	
		String ipAddress = scanner.next();
		Ipaddress ip = new Ipaddress();
		scanner.close();
		boolean b = ip.validateIpvalidator(ipAddress);
		if (b == true)
			System.out.println("Valid IpAddress");
		else
			System.out.println("Invalid IpAddress");
	}
	
}
