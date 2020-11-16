package com.main;

import java.util.Scanner;

import com.pojo.Room;

public class RoomMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the room details");
		int roomNo = scanner.nextInt();
		scanner.nextLine();
		String roomType = scanner.nextLine();
		float roomArea = scanner.nextFloat();
		boolean acMachine = scanner.nextBoolean();
		Room room = new Room(roomNo, roomType, roomArea, acMachine);
		System.out.println(room);
		scanner.close();
		room = null;
	}

}
