package springbootdemo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import  springbootdemo.model.Employee;

/**
 * 功能概要：User的DAO类

 */
@Mapper
public interface EmployeeDao {

	 Employee selectEmployeeByNo(String EmployeeNo);
	
	  

}
