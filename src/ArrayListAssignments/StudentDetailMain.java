package ArrayListAssignments;

import java.util.Scanner;

public class StudentDetailMain {
	private void appFlow() {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("Enter a Choice");
			System.out.println("1. Student Data Creation");
			byte choice = sc.nextByte();
			
			switch (choice) {
			case 1: {
				new StudentDataCreation().studentdatacreation();
				break;
			}
			case 2: {
				isTrue = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " );
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new StudentDetailMain().appFlow();
	}
}
