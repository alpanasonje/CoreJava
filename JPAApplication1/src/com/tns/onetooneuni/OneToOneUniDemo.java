package com.tns.onetooneuni;

import java.util.Scanner;

public class OneToOneUniDemo {

	public static void main(String[] args) {
		Student s1 = null;
		Address a1 = null;
		Scanner sc = null;
		int ch;
		try {
			sc = new Scanner(System.in);
			do {
				System.out.println("1. Add Student");
				System.out.println("2. Modify Student");
				System.out.println("3. Remove Student");
				System.out.println("4. Search Student");
				System.out.println("5. Add Address");
				System.out.println("6. Modify Address");
				System.out.println("7. Remove Address");
				System.out.println("8. Search Address");
				System.out.println("9. Exit");
				System.out.println("Enter your choice 1..9");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					a1 = new Address();
					a1.setAddressId(1003);
					a1.setStreet("CollegeRoad");
					a1.setCity("Nashik");
					a1.setState("Maharashtra");
					a1.setZipcode("422004");
					AddressService.addAddress(a1);
					s1 = new Student();
					s1.setStudentId(12);
					s1.setName("Harsha");
					s1.setAddress(a1);

					StudentService.addStudent(s1);
					break;

				case 2:
					s1 = StudentService.getStudent(11);
					if (s1 != null) {
						a1 = AddressService.getAddress(100);
						if (a1 != null) {
							s1.setAddress(a1);
							StudentService.updateStudent(s1);
						} else
							System.out.println("Address not Found");

					} else
						System.out.println("No such student found...");
					break;
				case 3:
					s1 = StudentService.getStudent(12);
					if (s1 != null)
						StudentService.removeStudent(s1);
					else
						System.out.println("No such student found...");
					break;
				case 4:
					s1 = StudentService.getStudent(12);
					if (s1 != null)
						System.out.println(s1);
					else
						System.out.println("No such student found...");
					break;

				case 5:
					a1 = new Address();
					a1.setAddressId(1002);
					a1.setStreet("MGRoad");
					a1.setCity("Nashik");
					a1.setState("Maharashtra");
					a1.setZipcode("422002");
					AddressService.addAddress(a1);
					break;
				case 6:

					a1 = AddressService.getAddress(100);
					if (a1 != null) {
						a1.setCity("Pune");
						AddressService.updateAddress(a1);
					} else
						System.out.println("Address not Found");

					break;
				case 7:
					a1 = AddressService.getAddress(100);
					if (a1 != null) {

						AddressService.removeAddress(a1);
					} else
						System.out.println("Address not Found");
					break;
				case 8:
					a1 = AddressService.getAddress(12);
					if (a1 != null)
						System.out.println(a1);
					else
						System.out.println("No such address found...");
					break;
				case 9:
					System.exit(0);

				}

			} while (ch != 9);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
