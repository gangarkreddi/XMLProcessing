package com.example.XMLProcessing.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vol_instructionData")
public class InstructionDataVo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "instructionDataId")
	private long instructionDataId;
	public String Source;
	public String InstructionType;

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getInstructionType() {
		return InstructionType;
	}

	public void setInstructionType(String instructionType) {
		InstructionType = instructionType;
	}

	public long getInstructionDataId() {
		return instructionDataId;
	}

	public void setInstructionDataId(long instructionDataId) {
		this.instructionDataId = instructionDataId;
	}
	

}
