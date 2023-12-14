package com.zettamine.java.day04.assignment04;

import java.util.Scanner;

public class StudentHostMain {
	static Scanner Scn = new Scanner(System.in);
	static Student stud;

	public static void main(String[] args) {

		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int studentId = Scn.nextInt();
		System.out.print("Student Name: ");
		String name = Scn.next();
		System.out.print("Department Id: ");
		int deptId = Scn.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = Scn.next();
		System.out.print("Phone Number: ");
		String phoneNo = Scn.next();
		while (true) {
			if (!phoneNo.matches("^[6789][0-9]{9}")) {
				System.out.print("please enter a valid phone number: ");
				phoneNo = Scn.next();
			}
			if (phoneNo.matches("^[6789][0-9]{9}")) {
				break;
			}
		}
		System.out.print("Hostel Name: ");
		String hostelName = Scn.next();
		System.out.print("Room Number: ");
		int roomNumber = Scn.nextInt();

		Hosteller hosteller = new Hosteller(hostelName, roomNumber);

		stud = new Student(studentId, name, deptId, gender, phoneNo, hosteller);
		getHostellerDetails();
		System.out.println("The Student Details are as follows:");

		System.out.println("Student ID     :" + stud.getStudentId());
		System.out.println("Student Name   :" + stud.getName());
		System.out.println("Department ID  :" + stud.getDepartmentId());
		System.out.println("Gender         :" + stud.getGender());
		System.out.println("Phone Number   :" + stud.getPhone());
		System.out.println("Hostel Name    :" + stud.hosteller.getHostelName());
		System.out.println("Room Number    :" + stud.hosteller.getRoomNumber());

	}

	public static Hosteller getHostellerDetails() {
		System.out.print("Modify room number(Y/N): ");
		String input = Scn.next();
		if (input.equalsIgnoreCase("y")) {
			System.out.print("New Room Number: ");
			stud.hosteller.setRoomNumber(Scn.nextInt());
		}
		System.out.print("Modify Phone number(Y/N): ");
		String ModPhNo = Scn.next();
		if (ModPhNo.equalsIgnoreCase("y")) {
			System.out.print("New Phone Number: ");
			String phNo = Scn.next();
			while (true) {
				if (phNo.matches("^[6789][0-9]{9}")) {
					stud.setPhone(phNo);
					break;
				} else {
					System.out.print("Please enter a valid phone number: ");
				}

			}
		}
		Scn.close();
		return stud.hosteller;

	}

}  