package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		 SpringApplication.run(DemoApplication.class, args);
	}
//@Autowired
//private EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception {
//
//		Employee employee=new Employee();
//		employee.setFirstName("Naveen");
//		employee.setLastName("Chauhan");
//		employee.setEmailId("ramesh12@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1=new Employee();
//		employee1.setFirstName("Suresh");
//		employee1.setLastName("Chauhan");
//		employee1.setEmailId("suresh12@gmail.com");
//
//		employeeRepository.save(employee1);




	}
}
