package springbootdemo.controller;



import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootdemo.model.Employee;
import springbootdemo.service.EmployeeService;
import springbootdemo.service.EmployeeServiceImpl;
import springbootdemo.mq.consumer;
import springbootdemo.mq.producer;

@RestController
public class TestRestController {
	@Autowired
	EmployeeService es;
	
	@Autowired  
	producer prod;
	
	@Autowired  
	consumer cons;
	
	//@CrossOrigin
	@RequestMapping(value = "/way/person/{id}", method =RequestMethod.GET)
	public Employee findOnePerson(@PathVariable("id") long id)
	{
		/*
		Person person = new Person();
		person.setId(id);
		person.setName("某人");
		*/
	
		String sid=String.valueOf(id);
		System.out.println("id:"+sid);
		Employee ee=es.selectUserById(sid);
		//System.out.println("employee:"+ee.toString());
		return ee;
		
	}
	
	
	//@CrossOrigin
	@RequestMapping(value = "/findEmployeeByID/{id}", method =RequestMethod.GET)
	public Employee findEmployeeByID(@PathVariable("id") long id)
	{
		/*
		Person person = new Person();
		person.setId(id);
		person.setName("某人");
		*/
		
		String sid=String.valueOf(id);
		System.out.println("id:"+sid);
		Employee ee=es.selectUserById(sid);
		//System.out.println("employee:"+ee.toString());
		return ee;
		
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/MQSendData/{content}", method =RequestMethod.GET)
	public String MQSendData(@PathVariable("content") String content)
	{
		Destination destination = new ActiveMQQueue("mytest.queue"); 
		prod.sendMessage(destination,content);  
		
		return content;
		
	}
   
	
	

	
}
