package com.springjdbc;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "My Program Started!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);  
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//      use to INSERT   
//        Student student = new Student();
//        student.setId(234);
//        student.setName("punam");
//        student.setCity("Buldhana");
//        int result = studentDao.insert(student);
//        System.out.println("Inserting Result....." + result);
 
//         USE TO UPDATE
//        Student student = new Student();
//        student.setId(234);
//        student.setName("Arjun");
//     	  student.setCity("Jambhora");
//     	  int result = studentDao.change(student);
//     	  System.out.println("Updating......"  + result);
          
//        USE TO DELETE
//        Student student =  new Student();
//        student.setId(457);
//        int delete = studentDao.delete(student);
//        System.out.println("Deleting....." + delete);

       List<Student> students = studentDao.getAllStudents();
       for(Student s : students) {
    	   System.out.println(s); 
       }
        
        
        
    }
}
