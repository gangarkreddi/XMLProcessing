package com.example.XMLProcessing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.XMLProcessing.dao.model.VolPayHubAlertNotification1Vo;
import com.example.XMLProcessing.model.VolPayHubAlertNotification1;

@Mapper
public interface VolPayHubAlertNotification1Mapper {
	@Mapping(target = "version", source = "version")
	@Mapping(target = "eventDateTime", source = "eventDateTime", dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z")
	@Mapping(target = "eventID", source = "eventID")
	@Mapping(target = "sourceSystemId", source = "sourceSystemId")
	@Mapping(target = "uniqueReferenceId", source = "uniqueReferenceId")
	VolPayHubAlertNotification1Vo coverter(VolPayHubAlertNotification1 source);
}
