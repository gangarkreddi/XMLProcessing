package com.example.XMLProcessing.dao.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vol_volPayHubAlertNotification1")
public class VolPayHubAlertNotification1Vo {

	@Id
	@Column(name = "uniqueReferenceId")
	private String uniqueReferenceId;
	@Column(name = "eventID")
	private String eventID;
	@Column(name = "eventDateTime")
	private Timestamp eventDateTime;
	@Column(name = "sourceSystemId")
	private String sourceSystemId;
	@Column(name = "version")
	private String version;

	// @OneToOne(targetEntity = Contents.class , mappedBy =
	// "volPayHubAlertNotification1",cascade = CascadeType.ALL)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "content_id", referencedColumnName = "contentId")
	private ContentsVo Contents;

	public ContentsVo getContents() {
		return Contents;
	}

	public void setContents(ContentsVo contents) {
		this.Contents = contents;
	}

	public String getUniqueReferenceId() {
		return uniqueReferenceId;
	}

	public void setUniqueReferenceId(String uniqueReferenceId) {
		this.uniqueReferenceId = uniqueReferenceId;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public Timestamp getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Timestamp eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "VolPayHubAlertNotification1 [ UniqueReferenceId=" + uniqueReferenceId + ", EventDateTime="
				+ eventDateTime + ", version=" + version + ", Contents=" + Contents + "]";
	}

}
