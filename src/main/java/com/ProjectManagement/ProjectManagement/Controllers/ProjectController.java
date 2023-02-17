package com.ProjectManagement.ProjectManagement.Controllers;

import java.net.URI;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ProjectManagement.ProjectManagement.Model.Project;
import com.ProjectManagement.ProjectManagement.Model.Projects;
import com.ProjectManagement.ProjectManagement.dao.ProjectsDAO;

@RestController
//@Controller
@RequestMapping("/Project") //Defines  a context
public class ProjectController extends ResponseEntityExceptionHandler{

	@Autowired
	private ProjectsDAO  projectsdao; //Good practice is to make Autowiring as private
	Logger  logger=Logger.getLogger("customlogger");
	@GetMapping (value="/listProjects", produces="application/json")

	public Projects getProjects()
	{
		logger.info("Returned list of projects");
		return projectsdao.getAllProjects();
	}
	

	protected ResponseEntity<Object> handleMethodArgumentNotValid
	(MethodArgumentNotValidException m, HttpHeaders headers, HttpStatus status, WebRequest webreq)
	{
		System.out.println("Exception : " + m.getMessage());
		System.out.println("Total failed validations : " + m.getErrorCount());
		return super.handleMethodArgumentNotValid(m, headers, status, webreq);
	}
}
