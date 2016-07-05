package com.CMS.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Repository;

import com.CMS.dao.StudentDao;
import com.CMS.data.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	public List<Student> fetchAllStudents() {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try{
			return (List<Student>)session.createCriteria(Student.class).list();
		}finally{
			transaction.commit();
			session.close();
		}
	}

}
