import java.util.Scanner;
public class PojoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,mail,gender;
		byte age;
		int regno;
		long mobno;
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Studnet Name:");
			name = sc.nextLine();
		System.out.println("Enter MailId: ");
			mail =sc.nextLine();
		System.out.println("Enter Gender: ");
			gender = sc.nextLine();
		System.out.println("Enter Mobile Number: ");
			mobno = sc.nextLong();
		System.out.println("Enter Age: ");
			age = sc.nextByte();
		System.out.println("Enter Reg.No: ");
			regno = sc.nextInt();
			
			stu.setName(name);
			stu.setMailId(mail);
			stu.setGender(gender);
			stu.setMobNo(mobno);
			stu.setAge(age);
			stu.setRegNo(regno);
		System.out.println("============================================");
		System.out.println("Student Details \n");
		System.out.println("Name:\t\t"+stu.getName()+"\n"+"Reg.No:\t\t"+stu.getRegNo()+"\n"+"Gender:\t\t"+stu.getGender()+
				"\n"+"Age:\t\t"+stu.getAge()+"\n"+"MobileNo:\t"+stu.getMobNo()+"\n"+"MailId:\t\t"+stu.getMailId());
		System.out.println("============================================");
	}

}
