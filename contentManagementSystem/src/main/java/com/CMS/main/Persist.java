package com.CMS.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.CMS.data.Subject;
import com.CMS.data.Teacher;

public class Persist {

	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Subject subject = new Subject();
		subject.setSubjectName("Maths");
		
		Teacher teacher = new Teacher();
		teacher.setTeacherName("Likita Shetty");
		teacher.setTeacherAddress("Malad");
		teacher.setTeacherBranch("Computers");
		teacher.setSubject(subject);
		
		/*Subject subject2 = new Subject();
		subject2.setSubjectName("Electronics");
		
		Student student = new Student();
		student.setStudentName("Aaradhya Dureha");
		student.setStudentClass("3rd Year");
		student.setStudentBranch("Comps");
		student.setStudentAddress("Nerul");
		student.getSubjects().add(subject);
		

		Student student1 = new Student();
		student1.setStudentName("Agradeep Khanra");
		student1.setStudentClass("4th Year");
		student1.setStudentBranch("Elex");
		student1.setStudentAddress("Panvel");
		student1.getSubjects().add(subject2);
		session.save(student);
		session.save(student1);
		session.save(subject);
		session.save(subject2);
		*/
		
		session.save(subject);
		session.save(teacher);
		
		transaction.commit();
		session.close();
		System.out.println("Saved!!!!");
	}

}
