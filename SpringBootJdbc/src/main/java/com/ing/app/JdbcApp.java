package com.ing.app;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ing.model.Parent;
import com.ing.model.Student;
import com.ing.service.DataBaseService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ing.repo", "com.ing.service"})
@EnableJpaRepositories("com.ing.repo")
@EntityScan("com.ing.model")
public class JdbcApp{
	

//	DataBaseService dataBaseService;
	
//	public JdbcApp(DataBaseService dbService) {
//		this.dataBaseService = dbService;
//	}

	public static void main(String[] args) throws BeansException {
		//SpringApplication.run(JdbcApp.class);
		ApplicationContext applicationContext = SpringApplication.run(JdbcApp.class, args);
		DataBaseService dataBaseService = applicationContext.getBean(DataBaseService.class);
		Student s1 = new Student("Abc","1","Mn","Fn");
		
		Parent p1 = new Parent("Aa");
		
		dataBaseService.create(s1,p1);
	}


//	@Override
//	public void run(String... args) throws Exception {
//
//		
//		Student s1 = new Student();
//		s1.setId((long) 1);
//		s1.setLevel("1");
//		s1.setName("Abc");
//		
//		dataBaseService.create(s1);
//		
//	}

}
