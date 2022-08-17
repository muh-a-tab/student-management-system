package com.spring.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.sms.entity.Student;
import com.spring.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//			Student student1 = new Student("Muhammet Ali","Taban","m.ali.taban@gmail.com");
//			studentRepository.save(student1);
//			
//			Student student2 = new Student("Yavuz","Aydemir","ysa@gmail.com");
//			studentRepository.save(student2);
//			
//			Student student3 = new Student("Anıl","Demirci","anil@gmail.com");
//			studentRepository.save(student3);
	}

}
