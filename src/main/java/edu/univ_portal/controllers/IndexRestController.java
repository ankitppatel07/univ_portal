package edu.univ_portal.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.univ_portal.service.IndexServiceImpl;

@RestController
public class IndexRestController {
	
	private static final Logger logger = LogManager.getLogger(IndexRestController.class);
	
	@Autowired
	private IndexServiceImpl indexServiceImpl;

	@GetMapping(value="/home")
	public ResponseEntity<String>  getTestData() {
		logger.info("Inside IndexRestController -> getTestData()");
		return new ResponseEntity<String>(indexServiceImpl.getTestDataService(), HttpStatus.OK);
	}
}
