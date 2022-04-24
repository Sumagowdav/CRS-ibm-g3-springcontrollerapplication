package com.ibm.restcontroller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Professor;
import com.ibm.bean.RegisteredCourse;

import com.ibm.dao.Professordao;

@RestController
@CrossOrigin
public class ProfessorController {
	
	    @Autowired
	    private Professordao professordao;

	    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET, value = "professor/students")
	    @ResponseBody
	    public List<Professor> getAllStudents() {
	        //list all professors
	        return professordao.list();
	    }
	    
	    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.POST, value = "/post/students/grades")
	    @ResponseBody
	    public ResponseEntity<RegisteredCourse> createProfessor(@RequestBody RegisteredCourse registeredCourse) {
	        //Grade students
	        professordao.grade(registeredCourse);
	        return new ResponseEntity<>(registeredCourse, HttpStatus.OK);
	    }


}
