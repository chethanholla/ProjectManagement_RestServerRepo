package com.ProjectManagement.ProjectManagement.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Repository;

import com.ProjectManagement.ProjectManagement.Model.Project;
import com.ProjectManagement.ProjectManagement.Model.Projects;

@Repository
public class ProjectsDAO {

	static Projects  plist=new Projects();
	static {
		LocalDateTime  ldt=LocalDateTime.now();
		
		Project  p1=new Project();
		p1.setProjectId(100);
		p1.setProjectName("IBM Corporation"); 
		p1.setStartDate(ldt.toString());
		p1.setEndDate(ldt.plusDays(300).toString());
		
		Project  p2=new Project();
		p2.setProjectId(101);
		p2.setProjectName("Petronas PLC");
		p2.setStartDate(ldt.toString());
		p2.setEndDate(ldt.plusDays(300).toString());
		
		plist.getProjectsList().add(p1);
		plist.getProjectsList().add(p2);
		
		System.err.println("Projects List initialized....");
	}
	public Projects getAllProjects() {
		return plist;
	}
	public void addProject(Project p) {
		
	}
	}
