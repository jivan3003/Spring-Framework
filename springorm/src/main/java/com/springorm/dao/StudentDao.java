package com.springorm.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

public class StudentDao {
	
//	In-build method in spring orm HibernateTemplate
	public HibernateTemplate hibernateTemplate;
	@Transactional
//	used to insert data 
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;	
	}
	
//	get the single data(object)    
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	 
//	get all student(all rows)
	public List<Student> getAllStudent(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students ;
	}
@Transactional
//	deleting the data
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
//	updating data 
@Transactional
public void updateStudent(int id, String name, String city)
{
	Student student = this.hibernateTemplate.get(Student.class, id);
	student.setStudentName(name);
	student.setStudentCity(city);
	this.hibernateTemplate.save(student);
}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
