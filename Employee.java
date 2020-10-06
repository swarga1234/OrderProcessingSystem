package com.hsbc.model;

public class Employee {
		
		int empID;
		String username;
		String password;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(int empID, String username, String password) {
			super();
			this.empID = empID;
			this.username = username;
			this.password = password;
		}

		public int getEmpID() {
			return empID;
		}

		public void setEmpID(int empID) {
			this.empID = empID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + empID;
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (empID != other.empID)
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [empID=" + empID + ", username=" + username + ", password=" + password + "]";
		}
		
		
}
