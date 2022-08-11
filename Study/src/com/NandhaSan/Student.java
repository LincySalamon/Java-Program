package com.NandhaSan;

import java.util.Objects;


public class Student{
		private String name;
		private int RollNo;
		private int age;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return RollNo;
		}
		public void setRollNo(int rollNo) {
			RollNo = rollNo;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("Tony");
	}

}
