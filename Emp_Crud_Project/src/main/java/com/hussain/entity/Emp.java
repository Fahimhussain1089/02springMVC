package com.hussain.entity;

import javax.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "emp")
public class Emp {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 	
	 	@Column(name = "full_name") 
	    private String fullName;
	 	
	 	@Column(name = "address")
	    private String address;
	 	
	 	@Column(name = "mail")
	    private String mail;
	 	
	 	@Column(name = "password")
	    private String password;
	 	
	 	@Column(name = "designation")
	    private String designation;
	 	
	 	@Column(name = "salary")
	    private String salary;

		//	    @ManyToOne
//	    @JoinColumn(name = "Designation_fk", referencedColumnName = "d_Id")
	  //  private DesignationDetails designationDetails;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}

	    


//	    public DesignationDetails getDesignationDetails() {
//	        return designationDetails;
//	    }
//
//	    public void setDesignationDetails(DesignationDetails designationDetails) {
//	        this.designationDetails = designationDetails;
//	    }

//	    @Override
//	    public String toString() {
//	        return "EmployeeDetails{" + designationDetails.getDesignationName()+
//	                ", fullName='" + fullName + '\'' +
//	                ", address='" + address + '\'' +
//	                ", mail='" + mail + '\''  +
//	                '}';
//	    }
		
		@Override
		public String toString() {
			return "Emp [id=" + id + ", fullName=" + fullName + ", address=" + address + ", mail=" + mail
					+ ", password=" + password + ", designation=" + designation + ", salary=" + salary + "]";
		}

}
