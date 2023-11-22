package com.w_b_l.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "List_Of_Employees")
public class SignUpEntity {
	@Id
	@GeneratedValue (generator = "Employee_Details", strategy = GenerationType.AUTO)
	@SequenceGenerator (name = "Employee_Details", sequenceName = "Id_Sequence", initialValue = 001, allocationSize = 1 )
	private int empId;
	private String empFirstName;
	private String empEmail;
	private String empPassword;
	private long empPhoneNo;
	private String empLocation;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public long getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(long empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
	
	
	
}
