package com.CMS.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_TEACHER_ID_NAME")
	@SequenceGenerator(name="SEQ_TEACHER_ID_NAME", sequenceName="SEQ_TEACHER_ID", allocationSize = 1)
	@Column(name="TEACHER_ID")
	private long teacherId;
	
	@Column(name="TEACHER_NAME")
	private String teacherName;

	@Column(name="TEACHER_ADDRESS")
	private String teacherAddress;

	@Column(name="TEACHER_BRANCH")
	private String teacherBranch;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="SUBJECT_ID")
	private Subject subject;

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public String getTeacherBranch() {
		return teacherBranch;
	}

	public void setTeacherBranch(String teacherBranch) {
		this.teacherBranch = teacherBranch;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
