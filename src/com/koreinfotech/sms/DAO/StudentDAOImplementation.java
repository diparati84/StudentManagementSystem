package com.koreinfotech.sms.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.koreinfotech.sms.domain.Student;
import com.koreinfotech.sms.Utils.HibernateUtils;

public class StudentDAOImplementation implements IStudentDAO {

	@Override
	public void addStudentContact(Student student) {
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();

	

	}

	@Override
	public List<Student> getALLStudent() {
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<Student> contacts=null;
		try{
			contacts=(List<Student>)session.createQuery("from Student").list();//list() is a method of criteria query,returns list
		}catch(HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		session.getTransaction().commit();
		session.close();
		return contacts;
			
	}
	public void deleteStudentContact(Integer id) {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		Student student = (Student) session.load(Student.class, id);
		if(student != null){
			session.delete(student);
		}
		session.getTransaction().commit();
		session.close();
	}




	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
