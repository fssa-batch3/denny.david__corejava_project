package com.fssa.denny.day3.practice;


	class Details {
		private String name;
		private String password;
		private String emailid;
		public Details() {
		}
		public Details(String name, String password, String emailid) {
			this.name = name;
			this.password = password;
			this.emailid = emailid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
	}
	public class Logger {
		public static void main(String[] args) {
			// create Account using Setter methods and Default constructor
			Details denny = new Details();//("Denny","Denny@2004","denny@gmail.com")
			denny.setName("Denny");
			denny.setPassword("denny@2004");
			denny.setEmailid("denny@gmail.com");
			System.out.println(denny.getName() + ", " + denny.getPassword() + ", "
					+ denny.getEmailid());
			
		}
	}

