package studentinfo;

public class Oops {
	public static void main(String[] args) {
		StudentManagement student = new StudentManagement();
		student.addStudent();
		student.addMoreStudent();
		student.printAll();
		student.updateStudent();
		student.printSelected();
	}
}
