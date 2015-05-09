/*package com.koreinfotech.sms.utils;

import com.koreinfotech.sms.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.koreinfotech.sms.domain.StudentCourseDetails;

public class HibernateUtils {
	
	public static void main(String args[]){
		
		//Student stud=new Student();
		StudentCourseDetails studcoursedetl=new StudentCourseDetails();
		 //studcoursedetl.setStudentcoursedetail_id(2);
		 studcoursedetl.setTotalAmount(5000);
		
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(studcoursedetl);
		
		studcoursedetl= (StudentCourseDetails) session.get(StudentCourseDetails.class,1);
		System.out.println("Student course details object having course amt as:" +studcoursedetl.getTotalAmount());
		
		studcoursedetl.setTotalAmount(6000);
		//session.update(studcoursedetl);
		session.delete(studcoursedetl);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
		
		}

}*/
package com.koreinfotech.sms.Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	
	
	private  static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
			
			Configuration config=new Configuration().configure();// pick up properties frm hibernate.cfg.xml file
			
		ServiceRegistryBuilder builder=new ServiceRegistryBuilder().applySettings(config.getProperties());
			sessionFactory=config.buildSessionFactory(builder.buildServiceRegistry());
			
	   }
		return sessionFactory;
		
	
	}
	
	public static Session getCurrentSession(){
		return getSessionFactory().getCurrentSession();
		
	}

	
	public static Session openSession(){
		return getSessionFactory().openSession();
    }
	
	
	public static  void  closeSession(Session session){
		
        if(session.isOpen()){
	    session.close();
	}
  }
}
