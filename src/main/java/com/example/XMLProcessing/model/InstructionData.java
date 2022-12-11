package com.example.XMLProcessing.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InstructionData")
@XmlAccessorType(XmlAccessType.FIELD)
public class InstructionData implements Serializable {

	private static final long serialVersionUID = -878496459852913826L;
	@XmlElement(name = "Source")
	public String source;
	@XmlElement(name = "InstructionType")
	public String instructionType;

	public InstructionData() {}		

	public InstructionData(String source, String instructionType) {		
		this.source = source;
		this.instructionType = instructionType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		source = source;
	}

	public String getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}

}
