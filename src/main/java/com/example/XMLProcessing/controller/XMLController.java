package com.example.XMLProcessing.controller;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.XMLProcessing.service.IXmlProcessService;

@RestController
public class XMLController {
	@Autowired
	IXmlProcessService service;

	@GetMapping
	@RequestMapping("process/{filetype}")
	public String process(@PathVariable("filetype") String filetype) throws IOException, JAXBException {
		service.process(filetype);		
		return "Success";
	}

	
}
