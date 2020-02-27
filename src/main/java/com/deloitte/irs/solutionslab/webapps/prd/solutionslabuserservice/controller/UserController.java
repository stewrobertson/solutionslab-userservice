package com.deloitte.irs.solutionslab.webapps.prd.solutionslabuserservice.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-service")
public class UserController {

	@GetMapping(value = "/api/{id}", produces = "application/json")
	public ResponseEntity<String> getUser(@PathVariable String id){

		return new ResponseEntity<>("ID Value: " + id, HttpStatus.OK);
	}
	
	@GetMapping(value = "/api", produces = "application/json")
	public ResponseEntity<String> getAllUsers(){
		return new ResponseEntity<>("All Users returned", HttpStatus.OK);
	}
	
	@PostMapping(path = "/api", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> createUsers(@RequestBody Map<String, Object> input) {
	    return new ResponseEntity<>("Added a new Users: " + input.get("id"), HttpStatus.OK);
	}
}
