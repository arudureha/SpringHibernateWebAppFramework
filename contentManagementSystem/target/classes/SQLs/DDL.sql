CREATE TABLE STUDENT
(
  STUDENT_ID NUMBER(3) NOT NULL PRIMARY KEY,
  STUDENT_NAME VARCHAR2(30),
  STUDENT_ADDRESS VARCHAR2(50),
  STUDENT_BRANCH VARCHAR2(20),
  STUDENT_CLASS VARCHAR2(20)
);
CREATE SEQUENCE SEQ_STUDENT_ID INCREMENT BY 1 START WITH 100 MAXVALUE 999;

CREATE TABLE SUBJECT
(
  SUBJECT_ID NUMBER(3) NOT NULL PRIMARY KEY,
  SUBJECT_NAME VARCHAR(20)
);
CREATE SEQUENCE SEQ_SUBJECT_ID START WITH 500 INCREMENT BY 1 MAXVALUE 999;

CREATE TABLE STUDENT_SUBJECT_PAR
(
  STUDENT_ID NUMBER(3), 
  SUBJECT_ID NUMBER(3),
  PRIMARY KEY(STUDENT_ID, SUBJECT_ID),
  CONSTRAINT STUDENT_ID_FK FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(STUDENT_ID),
  CONSTRAINT SUBJECT_ID_FK FOREIGN KEY(SUBJECT_ID) REFERENCES SUBJECT(SUBJECT_ID)
);

CREATE TABLE TEACHER
(
  TEACHER_ID NUMBER(3) NOT NULL PRIMARY KEY,
  TEACHER_NAME VARCHAR2(30),
  TEACHER_ADDRESS VARCHAR2(50),
  TEACHER_BRANCH VARCHAR2(20),
  SUBJECT_ID NUMBER(3),
  CONSTRAINT TEACHER_SUBJECT_ID_FK FOREIGN KEY(SUBJECT_ID) REFERENCES SUBJECT(SUBJECT_ID)
);

CREATE SEQUENCE SEQ_TEACHER_ID START WITH 300 INCREMENT BY 1 MAXVALUE 999;