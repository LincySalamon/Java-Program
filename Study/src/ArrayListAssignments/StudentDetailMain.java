package ArrayListAssignments;

import java.util.Scanner;

public class StudentDetailMain {
	private void appFlow() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("Enter a Choice");
			System.out.println("1. Student Data Creation");
			System.out.println("2. View All Student Details");
			System.out.println("3. Add student at 1st most position");
			
			System.out.println("4. Retrive Student Detail using Index");
			System.out.println("5. Update student detail By RollNo");
			System.out.println("6. Search b Student RollNo");
			
			System.out.println("7. Remove Student");
			System.out.println("8. Sorting Student list based on their name");
			
			System.out.println("100. Exit from Application");
			
			byte choice = sc.nextByte();
			
			switch (choice) {
				case 1: {
					new StudentDataCreation().studentdatacreation();
					break;
				}
				case 2: {
					new ViewStudentDetails();
					ViewStudentDetails.viewstudentdetails();
					break;
				}
				case 3: {
					new AddStudentFirst().addstudentfirst();
					break;
				}
				case 4: {
					new RetriveUsingIndex().retriveusingindex();
					break;
				}
				case 5: {
					new UpdateStudentDetailsRollNo().updatestudentdetail();
					break;
				}
				case 6: {
					new SearchByRollNO().searchbyrollno();
					break;
				}
				case 7: {
					new RemoveStudent().removestudent();
					break;
				}
				case 8: {
					new SortByName().sortbyname();
					break;
				}
				case 100: {
					isTrue = false;
					break;
				}
				default :{
					System.out.println();
					System.out.println("!!! Enter a valid choice !!!");
					break;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new StudentDetailMain().appFlow();
	}
}
