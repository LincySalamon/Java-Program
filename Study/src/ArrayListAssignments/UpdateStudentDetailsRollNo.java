package ArrayListAssignments;

import java.util.Scanner;

public class UpdateStudentDetailsRollNo {
	public void updatestudentdetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollNo to Update");
		int rollNum = sc.nextInt();
		System.out.println("Enter the Name to update");
		sc.nextLine();
		String nameUpdate = sc.nextLine();
		
		for(Student i : StudentDataCreation.studentInfo)
		{
			if(rollNum == i.getRollNo())
			{
				i.setName(nameUpdate);
				System.out.println("After Updating Student Detail"+"("+i.getRollNo()+") :");
				System.out.println(i.toString());
				break;
			}
		}
	}
}
