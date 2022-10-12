package com.servlet.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.servlet.student.dto.Student;

public class StudentDao {
Student s = new Student();
EntityManagerFactory emf =  Persistence.createEntityManagerFactory("vikas");
EntityManager em ;
EntityTransaction et;
public Student saveStudent(Student student) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	
	et.begin();
	em.persist(student);
	et.commit();
	
	
	return student;
	
}
}
