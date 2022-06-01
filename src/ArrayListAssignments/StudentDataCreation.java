package ArrayListAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataCreation {
	protected ArrayList<Student> studentInfo = new ArrayList<Student>();
	
	public void studentdatacreation(){
		
		Scanner sc = new Scanner(System.in);
		String name;
		int rollNo;
		String dOB;
		String email;
		int totalMarks;
		System.out.println("Enter the number of Student details to add: ");
		int count = sc.nextInt();
		while(count>0)
		{
			Student stuInfo = new Student();
			System.out.println("Enter the name: ");
			name = sc.nextLine();
			System.out.println("Enter the roll number: ");
			rollNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the date of birth: ");
			dOB = sc.nextLine();
			System.out.println("Enther the email address: ");
			email = sc.nextLine();
			System.out.println("Enter the Total Marks: ");
			totalMarks = sc.nextInt();
			stuInfo.setName(name);
			stuInfo.setRollNo(rollNo);
			stuInfo.setdOB(dOB);
			stuInfo.setEmail(email);
			stuInfo.setTotalMarks(totalMarks);
			
			studentInfo.add(stuInfo);
			
		}
	}
}
