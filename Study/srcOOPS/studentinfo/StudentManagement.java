package studentinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.PersonalInfo;

public class StudentManagement {

	private List<PersonalInfo> studentList = new ArrayList<PersonalInfo>();
	private Scanner scanner = new Scanner(System.in);

	public void addStudent() {
		PersonalInfo personalInfo = new PersonalInfo();
		System.out.print("Enter the RollNo: ");
		personalInfo.setRollNo(scanner.nextInt());
		System.out.print("Enter the Name: ");
		personalInfo.setName(scanner.next());
		System.out.print("Enter the Email Address: ");
		personalInfo.setEmail(scanner.next());
		System.out.print("Enter the Date Of Birth: ");
		personalInfo.setdOB(scanner.next());
		System.out.println("Student details added successfully");
		studentList.add(personalInfo);
		System.out.println();
	}

	public void addMoreStudent() {
		System.out.print("Enter total No.of students to be added: ");
		for (int index = 0, totalNo = scanner.nextInt();;) {
			if (index < totalNo) {
				addStudent();
				index++;
			} else {
				break;
			}
		}
	}

	public void updateStudent() {
		System.out.println();
		System.out.print("Enter the Student RollNo to be updated: ");
		int rollNo = scanner.nextInt();
		PersonalInfo selectedInfo = null;
		for (PersonalInfo info : studentList) {
			if (info.getRollNo() == rollNo) {
				selectedInfo = info;
				break;
			}
		}
		if (selectedInfo == null) {
			System.out.println("Student details not found!");
			System.out.println();
		} else {
			System.out.println("Enter new Email Address: ");
			selectedInfo.setEmail(scanner.next());
			System.out.println("Email Address updated successfully");

			System.out.println();
			System.out.println("Updated Info: ");
			print(selectedInfo);
		}
	}
	
	public void updateManyStudent() {
		System.out.print("Enter total No.of students to be updated: ");
		int index = 0, totalNo = scanner.nextInt();
		while (true) {
			if (index < totalNo) {
				updateStudent();
				index++;
			} else {
				break;
			}
		}

	}

	public void printAll() {
		if (studentList.isEmpty()) {
			System.out.println("No student info!");
			System.out.println();
		} else {
			System.out.println("All student details:");
			for (PersonalInfo info : studentList) {
				print(info);
			}
		}
	}

	private void print(PersonalInfo info) {
		System.out.println("Name: " + info.getName());
		System.out.println("Email: " + info.getEmail());
		System.out.println("Roll No: " + info.getRollNo());
		System.out.println("DOB: " + info.getdOB());
		System.out.println();

	}

	public void printSelected() {
		if (studentList.isEmpty()) {
			System.out.println("No student info!");
			System.out.println();
		} else {
			System.out.print("Enter Stuent RollNo to be printed: ");
			int rollNo = scanner.nextInt();
			boolean isFound = false;
			for (PersonalInfo info : studentList) {
				if (info.getRollNo() == rollNo) {
					print(info);
					isFound = true;
				}
			}
			if (!isFound) {
				System.out.println("Student info not found!");
				System.out.println();
			}
		}
	}
}
