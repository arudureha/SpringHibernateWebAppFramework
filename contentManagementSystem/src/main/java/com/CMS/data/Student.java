package com.CMS.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STUDENT_ID_NAME")
	@SequenceGenerator(name = "SEQ_STUDENT_ID_NAME", sequenceName = "SEQ_STUDENT_ID", allocationSize = 1)
	@Column(name = "STUDENT_ID")
	private Long studentId;

	@Column(name = "STUDENT_NAME", length = 30)
	private String studentName;

	@Column(name = "STUDENT_ADDRESS")
	private String studentAddress;

	@Column(name = "STUDENT_BRANCH")
	private String studentBranch;

	@Column(name = "STUDENT_CLASS")
	private String studentClass;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "STUDENT_SUBJECT_PAR", joinColumns = {@JoinColumn(name = "STUDENT_ID")},
				inverseJoinColumns = {@JoinColumn(name="SUBJECT_ID")})
	private Set<Subject> subjects = new HashSet<Subject>();

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
}
