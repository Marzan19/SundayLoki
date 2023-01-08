package com.upskill.assignment_4;

public class Assignment_4_1 {

	
	class Encapsulate {
		private String username = "Juel";
		private String password = "test";
		private String email = "juel@talentech.com";
		private String first_name = "Mohammad";
		private String last_name = "Haq";

		void display() {
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			System.out.println("Email: " + email);
			System.out.println("First name: " + first_name);
			System.out.println("Last name: " + last_name);
		}
	}

	public class Problem7 {

		public void main(String[] args) {
			Encapsulate e = new Encapsulate();
			e.display();
		}
	}

}
