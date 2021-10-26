package com.nishant.spring.springJDBC.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.spring.springJDBC.employee.dao.EmployeeDao;
import com.nishant.spring.springJDBC.employee.dto.Employee;

public class test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nishant/spring/springJDBC/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("piyush");
		employee.setLastname("cena");
		//int result = dao.create(employee);
		//int result = dao.update(employee);
		//int result = dao.delete(1);
		//Employee employeeR = dao.read(2);
		List<Employee> employeeAll= dao.find();
		System.out.println( employeeAll);
	}

}
