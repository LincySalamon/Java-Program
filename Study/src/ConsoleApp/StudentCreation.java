package ConsoleApp;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCreation {
	
	long StudentID;
	String StudentName;
	String StudentMobileNo;
	String StudentEmailID;
	
	static HashMap<Long, Student> studentDatabaseHashMap=new HashMap<Long, Student>();
	
	
	public void studentCreation() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter your Register Number :");
		this.StudentID=scanner.nextLong();
		System.out.println("Enter your name ");
		scanner.nextLine();
		this.StudentName=scanner.nextLine();
		System.out.println("Enter your mobile Number ");
		this.StudentMobileNo=scanner.next();
		System.out.println("Enter your EmailId");
		this.StudentEmailID=scanner.next();
		
		
		// value pushing in to an hashmap
		
		Student studentDetails=new Student(StudentName,StudentMobileNo,StudentEmailID);
		
		studentDatabaseHashMap.put(StudentID, studentDetails);
		
		
		
	}
	
	

}
