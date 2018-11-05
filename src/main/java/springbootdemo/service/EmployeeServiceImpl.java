package springbootdemo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import springbootdemo.dao.EmployeeDao;
import springbootdemo.model.Employee;


/**
 * 功能概要：UserService实现类
 * 
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;

	public Employee selectUserById(String  EmployeeNo) {
		return employeeDao.selectEmployeeByNo(EmployeeNo);
		
	}

}
