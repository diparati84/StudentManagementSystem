package com.koreinfotech.sms.Service;

import java.util.List;

import com.koreinfotech.sms.DAO.IStudentDAO;
import com.koreinfotech.sms.DAO.StudentDAOImplementation;
import com.koreinfotech.sms.domain.Student;

public class StudentServiceImplementation implements IStudentService {
	
	 private IStudentDAO studentdao = new StudentDAOImplementation();
	   
		@Override
		public void addStudentContact(Student student) {
		
	       studentdao.addStudentContact(student);
		}

		@Override
		public List<Student> getALLStudent() {

			return studentdao.getALLStudent();
		}
		
		@Override
		public void deleteStudentContact(Integer id) {
			studentdao.deleteStudentContact(id);
		}

	}



