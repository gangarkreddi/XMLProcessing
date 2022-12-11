package com.example.XMLProcessing.unmarshal;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.XMLProcessing.model.VolPayHubAlertNotification1;

@Component
public class XmlUnMarshaler {
	public VolPayHubAlertNotification1 unMarshalXML(String filetype) throws IOException, JAXBException {
		File file = new ClassPathResource("persons.xml").getFile();
		System.out.println(file.getName());
		JAXBContext jaxbContext = JAXBContext.newInstance(VolPayHubAlertNotification1.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		VolPayHubAlertNotification1 que = (VolPayHubAlertNotification1) jaxbUnmarshaller.unmarshal(file);
        return que;
	}
}
