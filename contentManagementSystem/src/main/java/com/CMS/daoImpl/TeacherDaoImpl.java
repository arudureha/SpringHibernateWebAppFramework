package com.CMS.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Repository;

import com.CMS.dao.TeacherDao;
import com.CMS.data.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao{

	public List<Teacher> fetchAllTeachers() {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try{
			List<Teacher> teachers = (List<Teacher>) session.createCriteria(Teacher.class).list();
			return teachers;
		}finally{
			transaction.commit();
			session.close();
		}
	}

}
