package com.example.XMLProcessing.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VolPayHubAlertNotification1")
@XmlAccessorType(XmlAccessType.FIELD)
public class VolPayHubAlertNotification1  implements Serializable{

	private static final long serialVersionUID = -7982369427009433753L;
	@XmlElement(name = "UniqueReferenceId")
	public String uniqueReferenceId;
	@XmlElement(name = "SourceSystemId")
	public String sourceSystemId;
	@XmlElement(name = "EventID")
	public String eventID;
	@XmlElement(name = "EventDateTime")
	public String eventDateTime;
	@XmlElement(name = "Version")
	public String version;
	@XmlElement(name = "Contents")
	public Contents contents;
	public VolPayHubAlertNotification1() {	}
	public VolPayHubAlertNotification1(String uniqueReferenceId, String sourceSystemId, String eventID, String eventDateTime,
			String version, Contents contents) {
		
		this.uniqueReferenceId = uniqueReferenceId;
		this.sourceSystemId = sourceSystemId;
		this.eventID = eventID;
		this.eventDateTime = eventDateTime;
		this.version = version;
		this.contents = contents;
	}
	public String getUniqueReferenceId() {
		return uniqueReferenceId;
	}
	public void setUniqueReferenceId(String uniqueReferenceId) {
		this.uniqueReferenceId = uniqueReferenceId;
	}
	public String getSourceSystemId() {
		return sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}
	public Object getEventID() {
		return eventID;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	public String getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Contents getContents() {
		return contents;
	}
	public void setContents(Contents contents) {
		this.contents = contents;
	}
	
}
