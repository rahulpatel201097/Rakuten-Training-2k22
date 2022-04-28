package com.example.jpa;

import com.example.jpa.model.Employee;
import com.example.jpa.model.EmployeeIdentity;
import com.example.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCompositePrimaryKeyDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaCompositePrimaryKeyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Cleanup employees table
		employeeRepository.deleteAllInBatch();

		// Insert a new Employee in the database
		Employee employee = new Employee(new EmployeeIdentity("E-123", "D-457"),
				"Rahul Patel",
				"iamrahul@gmail.com",
				"+91-7690999235");

		employeeRepository.save(employee);
		Employee employee1 = new Employee(new EmployeeIdentity("E-122", "D-456"),
				"Rohit Patel",
				"rohit@gmail.com",
				"+91-9990999111");
		
		employeeRepository.save(employee1);
		// Retrieving an Employee Record with the composite primary key
		employeeRepository.findById(new EmployeeIdentity("E-123", "D-457"));

		// Retrieving all the employees of a particular company
		employeeRepository.findByEmployeeIdentityCompanyId("D-457");
	}
}
