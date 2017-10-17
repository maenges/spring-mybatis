package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

// 자동으로 빈에 등록되게 함

@Service
public class HRServiceImpl implements HRService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = employeeMapper.getAllEmployees();
		if(employees.isEmpty()) {
			throw new RuntimeException("조회결과가 존재하지 않는다.");
		}
		//System.out.println("조회된사원수"+employees.size());
		return employees;
	}
}
