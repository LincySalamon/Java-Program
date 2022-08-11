package ArrayListAssignments;

import java.util.Scanner;

public class SearchByRollNO {
	public void searchbyrollno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll number to search Student Detail");
		int rollNoSearch = sc.nextInt();
		
		for(Student i : StudentDataCreation.studentInfo)
		{
			if(rollNoSearch == i.getRollNo())
			{
				System.out.println("Search Result for Roll No "+i.getRollNo());
				System.out.println(i.toString());
				break;
			}
		}
	}
}
