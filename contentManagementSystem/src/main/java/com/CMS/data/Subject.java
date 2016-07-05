package com.CMS.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_SUBJECT_ID_NAME")
	@SequenceGenerator(name = "SEQ_SUBJECT_ID_NAME", sequenceName = "SEQ_SUBJECT_ID", allocationSize=1)
	@Column(name="SUBJECT_ID")
	private long subjectId;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@ManyToMany(mappedBy="subjects")
	private Set<Student> students = new HashSet<Student>(); 

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
