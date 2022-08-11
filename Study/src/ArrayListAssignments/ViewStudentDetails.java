package ArrayListAssignments;

public class ViewStudentDetails {
	public static void viewstudentdetails() {
		for(Student i: StudentDataCreation.studentInfo) {
			System.out.println(i.toString());
		}
	}
}
