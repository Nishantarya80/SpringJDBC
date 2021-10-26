package com.nishant.spring.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springJDBC/config.xml");
		JdbcTemplate bean = (JdbcTemplate)ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = bean.update(sql,new Integer(1),"nishant","arya");
		System.out.println("no of record inserted "+result);
	}

}
