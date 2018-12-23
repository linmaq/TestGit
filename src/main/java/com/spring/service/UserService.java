package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
/**
 * 
 * @author Administrator
 *springboot 整合 JdbcTemplate
 */
@Service
public class UserService {
	@Autowired
	private JdbcTemplate template;
	//增加
	public void addUser(String name,String pwd) {
		String sql = "INSERT INTO user(id,name,pwd,role) VALUES(6,?,?,'user')";
		template.update(sql,name,pwd);
		System.out.println("创建成功...");
	}
	//查询
	public List findAll() {
		String sql = "select * from user";
		List userList = template.queryForList(sql);
		return userList;
	}

}
