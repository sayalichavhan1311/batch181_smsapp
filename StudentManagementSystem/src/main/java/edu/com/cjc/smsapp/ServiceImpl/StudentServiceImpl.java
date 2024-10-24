package edu.com.cjc.smsapp.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.com.cjc.smsapp.Model.Student;
import edu.com.cjc.smsapp.Repository.StudentRepository;
import edu.com.cjc.smsapp.service.StudentService;

public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository sr;

	public void saveStudentDetails(Student s) {
		sr.save(s);
	}

}
