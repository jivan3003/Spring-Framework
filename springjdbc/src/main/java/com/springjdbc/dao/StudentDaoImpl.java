package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entites.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	INSERT
	public int insert(Student student) {
		String query ="insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
//	UPDATE
	@Override
	public int change(Student student) {
		String query ="update student set name=? ,city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
//	DELETE
	@Override
	public int delete(Student student) {
		String query ="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,student.getId());
		return r;
	}
	
//	Select single data
	@Override
	public Student getStudent(int studentId) {
		String query ="select*from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	
//	Select multiple data	
	@Override
	public List<Student> getAllStudents() {
		String query ="select*from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	
}
