package com.NithinDev;

import java.util.ArrayList;


public class EmployeeWithPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empArr = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("Lincy",10,28,9876543213l);
		Employee emp2 = new Employee("Jad",23,05,98766563213l);
		Employee emp3 = new Employee("Tony",7,03,987676654213l);
		Employee emp4 = new Employee("Salamon",43,32,98709563213l);
		
		empArr.add(emp1);
		empArr.add(emp2);
		empArr.add(emp3);
		empArr.add(emp4);
		
		for(Employee i:empArr)
		{
			if(i.getEmpID() == 23)
			 System.out.println(i.toString());
		}
		/*System.out.println("Enter number of employee details:");
		int num = sc.nextInt();
		System.out.println("Enter Employee Details:Name,ID,Age,MobNo");
		while(num < sc.hasNext())
		{
			String empName = sc.nextLine();
			sc.nextLine();
			int empID = sc.nextInt();
			int empAge = sc.nextInt();
			long mobNo = sc.nextLong();
			empArr.add(emp);
		}
		System.out.println(emp.getEmpName());*/
		
		
	}

}
