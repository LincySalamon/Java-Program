package ArrayListAssignments;

import java.util.Scanner;

public class RetriveUsingIndex {
	public void retriveusingindex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index position to Retrive student Date");
		int retriveIndex = sc.nextInt();
		System.out.println(StudentDataCreation.studentInfo.get(retriveIndex));
	}
}
