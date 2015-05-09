package com.koreinfotech.sms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@Column(name="STUDENT_ID",nullable=false)
	private int studentid;
	
	@Column(name="FIRST_NAME")//nullable=false)
	private String firstname;
	
	@Column(name="LAST_NAME")//nullable=false)
	private String lastname;
	
	@Column(name="NAME_ON_CERTIFICATE")//nullable=false)
	private String name_on_certificate;
	
	@Column(name="IC_NO_Student")//nullable=false)
	private String ic_number_student;
	
	@Column(name="IC_NO_PARENT")//nullable=false)
	private String ic_number_parent;
	
	@Column(name="DATE_OF_BIRTH")//nullable=false)
	@Temporal(TemporalType.DATE)
	private Date date_of_birth;
	
	@Column(name="GENDER")//nullable=false)
	private String gender;
	
	@Column(name="MOBILE_NO_Student")//nullable=false)
	private String mobile_no_student;
	
	@Column(name="MOBILE_NO_PARENT")//nullable=false)
	private String mobile_no_parent;
	
	@Column(name="ALT_TEL_NO")//nullable=false)
	private String alt_tel_no;
	
	@Column(name="EMAIL")//nullable=false)
	private String email;
	
	@Column(name="ADDRESS")//nullable=false)
	private String address;
	
	@Column(name="POSTAL_CODE")//nullable=false)
	private int postal_code;
	
	@Column(name="COURSE_TITLE")//nullable=false)
	private int course_title;
	
	@Column(name="HOW_DID_YOU_FIND_OUT_ABOUT_US")//nullable=false)
	private int find_out;
	
	
	

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", name_on_certificate="
				+ name_on_certificate + ", ic_number_student="
				+ ic_number_student + ", ic_number_parent=" + ic_number_parent
				+ ", date_of_birth=" + date_of_birth + ", gender=" + gender
				+ ", mobile_no_student=" + mobile_no_student
				+ ", mobile_no_parent=" + mobile_no_parent + ", alt_tel_no="
				+ alt_tel_no + ", email=" + email + ", address=" + address
				+ ", postal_code=" + postal_code + ", course_title="
				+ course_title + ", find_out=" + find_out + ", getStudentid()="
				+ getStudentid() + ", getFirstname()=" + getFirstname()
				+ ", getLastname()=" + getLastname()
				+ ", getNameOnCertificate()=" + getNameOnCertificate()
				+ ", getIc_number_student()=" + getIc_number_student()
				+ ", getIc_number_parent()=" + getIc_number_parent()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getGender()="
				+ getGender() + ", getMobile_no_student()="
				+ getMobile_no_student() + ", getMobile_no_parent()="
				+ getMobile_no_parent() + ", getAlt_tel_no()="
				+ getAlt_tel_no() + ", getEmail()=" + getEmail()
				+ ", getAddress()=" + getAddress() + ", getPostal_code()="
				+ getPostal_code() + ", getCourse_title()=" + getCourse_title()
				+ ", getFind_out()=" + getFind_out() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNameOnCertificate() {
		return name_on_certificate;
	}

	public void setNameOnCertificate(String nameOnCertificate) {
		this.name_on_certificate = name_on_certificate;
	}

	public String getIc_number_student() {
		return ic_number_student;
	}

	public void setIc_number_student(String ic_number_student) {
		this.ic_number_student = ic_number_student;
	}

	public String getIc_number_parent() {
		return ic_number_parent;
	}

	public void setIc_number_parent(String ic_number_parent) {
		this.ic_number_parent = ic_number_parent;
	}

	public Date getDateOfBirth() {
		return date_of_birth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile_no_student() {
		return mobile_no_student;
	}

	public void setMobile_no_student(String mobile_no_student) {
		this.mobile_no_student = mobile_no_student;
	}

	public String getMobile_no_parent() {
		return mobile_no_parent;
	}

	public void setMobile_no_parent(String mobile_no_parent) {
		this.mobile_no_parent = mobile_no_parent;
	}

	public String getAlt_tel_no() {
		return alt_tel_no;
	}

	public void setAlt_tel_no(String alt_tel_no) {
		this.alt_tel_no = alt_tel_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	public int getCourse_title() {
		return course_title;
	}

	public void setCourse_title(int course_title) {
		this.course_title = course_title;
	}

	public int getFind_out() {
		return find_out;
	}

	public void setFind_out(int find_out) {
		this.find_out = find_out;
	}
	
}	