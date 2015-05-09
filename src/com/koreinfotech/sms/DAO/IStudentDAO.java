package com.koreinfotech.sms.DAO;

import java.util.List;

import com.koreinfotech.sms.domain.Student;

public interface IStudentDAO {
        public void addStudentContact(Student student);
		public List<Student> getALLStudent();
		public void deleteStudentContact(Integer id);

	}



