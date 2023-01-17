package com.tns.jpaintro;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADemo {

	public static void main(String[] args) {

		Student s1;
		Scanner sc;
		int ch;
		try {
			sc = new Scanner(System.in);
			do {
				System.out.println("1. Add Student");
				System.out.println("2. Modify Student");
				System.out.println("3. Remove Student");
				System.out.println("4. Search Student");
				System.out.println("5. Exit");
				System.out.println("Enter your choice 1..5");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					s1 = new Student();
					s1.setRollNo(3);
					s1.setName("Pratik");
					s1.setPer(69);
					StudentService.addStudent(s1);
					break;
				case 2:
					s1 = StudentService.getStudent(2);
					s1.setPer(88);
					StudentService.updateStudent(s1);
					break;
				case 3:
					s1 = StudentService.getStudent(2);
					StudentService.removeStudent(s1);
					break;
				case 4:
					s1 = StudentService.getStudent(2);
					System.out.println(s1);
					break;
				case 5:
					System.exit(0);

				}

			} while (ch != 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
