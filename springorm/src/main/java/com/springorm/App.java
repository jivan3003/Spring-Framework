package com.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student =new Student(333,"navin","amravati");
//        int r = studentDao.insert(student);
//        System.out.println("done"+ r);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true; 
        while(go) {
        System.out.println("PRESS 1 for add new student");
        System.out.println("PRESS 2 for display all student");
        System.out.println("PRESS 3 for get detail of single student");
        System.out.println("PRESS 4 for delete student");
        System.out.println("PRESS 5 for update student");
        System.out.println("PRESS 6 for EXIT");
        try {
        	int input = Integer.parseInt(br.readLine());
//        	if(input==1) {
//        		//add new student
//        		
//        	}else if(input==2) {
//        		// display all student
        	switch(input)
        	{
        	case 1:
        		//add new student
        		//taking inputs from users
        		System.out.println("Enter user id :");
        		int uId = Integer.parseInt(br.readLine());
        		
        		System.out.println("Enter user city :");
        		String uCity = br.readLine();
        		
        		System.out.println("Enter user name :");
        		String uName = br.readLine();

        		//creating student object and setting values
        		Student s = new Student();
        		s.setStudentId(uId);
        		s.setStudentCity(uCity);
        		s.setStudentName(uName);

        		// saving student object to database by calling insert of student dao
        		int r = studentDao.insert(s);
        		System.out.println(r + "  Student Added");
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        		System.out.println();
        		
        		break;
        	case 2:
        		//display all student
        		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        		List<Student> allstudents = studentDao.getAllStudent();
        		for(Student st : allstudents) {
        			System.out.println("Id : "  + st.getStudentId());
        			System.out.println("Name : "  + st.getStudentName());
        			System.out.println("City : "  + st.getStudentCity());
        			System.out.println("_______________________________");
        		}
        		break;
        	case 3:
        		//get detail of single student
        		System.out.println("Enter user id :");
        		int userId = Integer.parseInt(br.readLine());
        		Student student = studentDao.getStudent(userId);
    			System.out.println("Id : "  + student.getStudentId());
    			System.out.println("Name : "  + student.getStudentName());
    			System.out.println("City : "  + student.getStudentCity());
    			System.out.println("_______________________________");
        		break;
        	case 4:
        		//for delete student
        		System.out.println("Enter user id :");
        		int id = Integer.parseInt(br.readLine());
        		studentDao.deleteStudent(id);
        		System.out.println("data deleted");
        		break;
        	case 5:
        		//update student
        		System.out.println("Enter user id :");
        		int uID = Integer.parseInt(br.readLine());
        		
        		System.out.println("Enter user city :");
        		String uCitys = br.readLine();
        		
        		System.out.println("Enter user name :");
        		String uNames = br.readLine();
        		studentDao.updateStudent(uID, uNames, uCitys);
        		System.out.println("update successfully");
        		break;
        	case 6:
        		//EXIT
        		go = false;
        		break;
        	}
        }catch(Exception e){
        	System.out.println("Invalid Input Try with another one");
        	System.out.println(e.getMessage());
        }
        }
        System.out.println("Thank you");
    }
}
