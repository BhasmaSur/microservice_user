package com.apis.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="users_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@NotNull
	private String name;
	@NotNull
	@Column(unique=true)
	private String userName;   //user name should be unique
	@NotNull
	@Column(unique=true)
	private String email;
	@NotNull
	private String password;

	private String dob;

	private String preferenceCourses;

	private String preferenceSubjects;

	private String preferenceExams;

	@Column(name = "picByte", length = 1000)
	private byte[] picByte;

	private String picType;
	@NotNull
	private String roles;
	@NotNull
	private boolean active;

	private String age;

	private String mobile;

	private String address;

	private String biodata;

	private String proffession;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPreferenceCourses() {
		return preferenceCourses;
	}

	public void setPreferenceCourses(String preferenceCourses) {
		this.preferenceCourses = preferenceCourses;
	}

	public String getPreferenceSubjects() {
		return preferenceSubjects;
	}

	public void setPreferenceSubjects(String preferenceSubjects) {
		this.preferenceSubjects = preferenceSubjects;
	}

	public String getPreferenceExams() {
		return preferenceExams;
	}

	public void setPreferenceExams(String preferenceExams) {
		this.preferenceExams = preferenceExams;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	public String getPicType() {
		return picType;
	}

	public void setPicType(String picType) {
		this.picType = picType;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBiodata() {
		return biodata;
	}

	public void setBiodata(String biodata) {
		this.biodata = biodata;
	}

	public String getProffession() {
		return proffession;
	}

	public void setProffession(String proffession) {
		this.proffession = proffession;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String userName, String email, String password, String dob,
			String preferenceCourses, String preferenceSubjects, String preferenceExams, byte[] picByte, String picType,
			String roles, boolean active, String age, String mobile, String address, String biodata,
			String proffession) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.preferenceCourses = preferenceCourses;
		this.preferenceSubjects = preferenceSubjects;
		this.preferenceExams = preferenceExams;
		this.picByte = picByte;
		this.picType = picType;
		this.roles = roles;
		this.active = active;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		this.biodata = biodata;
		this.proffession = proffession;
	}

	public User(int userId, String name, String userName, String email, String password, String roles, boolean active) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}
	
	
	
	
}
