package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {

	@Autowired
	EmpRepo emprepo;
	
	@RequestMapping("add")
	public List<Employee> saveUpdate(@RequestBody Employee employee)
	{
		emprepo.save(employee);
		return emprepo.findAll();
	}
	
	@RequestMapping("get")
	public List<Employee> get()
	{
		List<Employee> list=emprepo.findAll();
		return list;
	}
	
	@RequestMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		emprepo.deleteById(id);
	}
	
	@RequestMapping("searchByName/{name}")
	List<Employee> searchByName(@PathVariable String name)
	{
		List<Employee> list=emprepo.findByName(name);
		return list;
	}
	
}