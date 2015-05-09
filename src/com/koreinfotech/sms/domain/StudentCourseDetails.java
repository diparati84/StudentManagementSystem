package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="STUDENTCOURSEDETAILS")
public class StudentCourseDetails {
	@Id
	@GeneratedValue
	@Column(name="STUDENTCOURSEDETL_ID",nullable=false)
	private int studentcoursedetail_id;
	@Column(name="TOTAL_AMT",nullable=false)
	private double totalAmount;
	public int getStudentcoursedetail_id() {
		return studentcoursedetail_id;
	}
	public void setStudentcoursedetail_id(int studentcoursedetail_id) {
		this.studentcoursedetail_id = studentcoursedetail_id;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
