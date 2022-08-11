package MarupadiPgm;

public class Q8_StaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Tony");
		Student s2 = new Student(102,"Jadz");
		s1.display();
		s2.display();
	}
}
class Student{
	int rollNo;
	String name;
	static String collegeName = "PSN";
	Student(int r,String str){
		int rollNo = r;
		String name = str;
	}
	void display() {
		System.out.println(rollNo+" "+name+" "+collegeName);
	}
}
