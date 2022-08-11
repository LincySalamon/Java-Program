package ArrayListAssignments;

import java.util.Collections;

public class SortByName {
	public void sortbyname() {
		Collections.sort(StudentDataCreation.studentInfo, new nameComparator());
		System.out.println("Afer Sorting Student detail by name");
		for(Student i:StudentDataCreation.studentInfo)
		{
			System.out.println(i.toString());
		}
	}
}
