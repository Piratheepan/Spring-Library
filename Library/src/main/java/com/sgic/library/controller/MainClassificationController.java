package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.entities.MainClassification;
import com.sgic.library.services.MainClassificationImpl;
import com.sgic.library.services.MainClassificationService;

@RestController
//@CrossOrigin
public class MainClassificationController {
	private static Logger logger=LogManager.getLogger(MainClassificationController.class);
	@Autowired
	MainClassificationService mainClassificationService;
	@PostMapping("/mainclassification")
 	public HttpStatus createMainClassification(@Valid @RequestBody MainClassification mainClassification) {
		
		mainClassificationService.saveMainClassification(mainClassification);
	 	return HttpStatus.CREATED;
 }
	@GetMapping("/mainclassification")
 	public List<MainClassification> getMainClassifications() {
		logger.error("this is a info message");
		List<MainClassification> mainClassificationList=mainClassificationService.findAll();
	 	return mainClassificationList;
 }
}
