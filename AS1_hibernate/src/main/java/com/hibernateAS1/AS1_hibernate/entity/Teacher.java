package com.hibernateAS1.AS1_hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher") 
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // property to AutoIncrement
	@Column(name = "teacherid") // to change column name
	private int Id;
	@Column(name="f_name",length = 120,nullable = false)
	private String f_name;
	@Column(name="l_name",length = 120,nullable = false)
	private String l_name;
	@Column(name="email",length = 120,nullable = false)
	private String email;
	
	public Teacher()
	{
		
	}
	
	public Teacher(String f_name, String l_name, String email) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + "]";
	}
}
