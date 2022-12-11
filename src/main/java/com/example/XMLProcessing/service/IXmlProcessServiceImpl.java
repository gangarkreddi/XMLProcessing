package com.example.XMLProcessing.service;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.XMLProcessing.dao.VolPayHubAlertNotification1Repo;
import com.example.XMLProcessing.dao.model.VolPayHubAlertNotification1Vo;
import com.example.XMLProcessing.mapper.VolPayHubAlertNotification1Mapper;
import com.example.XMLProcessing.model.VolPayHubAlertNotification1;
import com.example.XMLProcessing.unmarshal.XmlUnMarshaler;

@Service
public class IXmlProcessServiceImpl implements IXmlProcessService {
	@Autowired
	XmlUnMarshaler xmlUnMarshal;
	@Autowired
	VolPayHubAlertNotification1Repo repo;
	VolPayHubAlertNotification1Mapper xmlMapper = Mappers.getMapper(VolPayHubAlertNotification1Mapper.class);

	@Override
	public void process(String filetype) throws IOException, JAXBException {
		VolPayHubAlertNotification1 que = xmlUnMarshal.unMarshalXML(filetype);
		VolPayHubAlertNotification1Vo items = xmlMapper.coverter(que);
		repo.save(items);
	}

}
