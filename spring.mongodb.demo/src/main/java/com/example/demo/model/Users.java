package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	
	@Id
	String id;
	String name;
	String teamname;
	Long salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Users(String id, String name, String teamname, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.teamname = teamname;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", teamname=" + teamname + ", salary=" + salary + "]";
	}
	
	

}
