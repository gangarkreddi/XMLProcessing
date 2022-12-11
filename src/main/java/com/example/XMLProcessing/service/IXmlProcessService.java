package com.example.XMLProcessing.service;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public interface IXmlProcessService {
	public void process(String filetype) throws IOException, JAXBException;
}
