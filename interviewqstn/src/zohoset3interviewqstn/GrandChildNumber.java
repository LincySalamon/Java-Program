package zohoset3interviewqstn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrandChildNumber {
	
	static List<Family> familyList = new ArrayList<Family>();
	
	private void findGrandChild() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of combination:");
		int num = sc.nextInt();
		System.out.println("Enter son and father name with space seperate: ");
		
		while(num>=0)
		{
			String familyName = sc.nextLine();
			String[] members = familyName.split(" "); 
			//Family family = new Family(members[0],members[1]);
			if(members.length>1)
				familyList.add(new Family(members[0],members[1]));
			num--;
		}
		System.out.println(familyList.toString()); 
		System.out.println("Enter Grand Father name to find number of grand child ");
		String grandfather = sc.nextLine(); 
		System.out.println(findNoOfChildren(grandfather,0));
	}

	public int findNoOfChildren(String grandfather, int count) {
		
		for(Family f: familyList)
		{
			if(f.fatherName.equals(grandfather))
			{
				count = findNoOfGrandChild(f.childName,count);
			} 
		}
		return count; 
	}

	public int findNoOfGrandChild(String childName, int count) {
		for(Family f: familyList)
		{
			if(f.fatherName.equals(childName))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		new GrandChildNumber().findGrandChild();
	}

	
}
class Family{
	String childName;
	String fatherName;
	
	public Family(String cName,String fName) {
		this.childName = cName;
		this.fatherName = fName;
	}

	@Override
	public String toString() {
		return "Family [sonName=" + childName + ", fatherName=" + fatherName + "]";
	}
	
}
