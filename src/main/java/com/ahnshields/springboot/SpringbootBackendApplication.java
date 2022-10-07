package com.ahnshields.springboot;

import com.ahnshields.springboot.model.Employee;
import com.ahnshields.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Abraham");
//		employee.setLastName("Lincoln");
//		employee.setEmailId("abraham@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Andrew");
//		employee1.setLastName("Jackson");
//		employee1.setEmailId("andrew@gmail.com");
//		employeeRepository.save(employee1);
	}

}
