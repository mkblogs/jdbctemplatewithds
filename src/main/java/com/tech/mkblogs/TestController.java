package com.tech.mkblogs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("/test")
	public String getObject() throws Exception {
		System.out.println(dataSource.toString());
		System.out.println(dataSource.getConnection().toString());
		return dataSource.toString();
	}
}
