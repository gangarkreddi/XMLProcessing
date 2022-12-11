package com.example.XMLProcessing.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentControlDataNo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentControlDataNo implements Serializable {

	private static final long serialVersionUID = 1686918043057796243L;
	@XmlElement(name = "officeCode")
	public String officeCode;
	@XmlElement(name = "branchCode")
	public String branchCode;
	@XmlElement(name = "InstructionData")
	public InstructionData instructionData;

	public PaymentControlDataNo() {	}

	public PaymentControlDataNo(String officeCode, String branchCode,
			InstructionData instructionData) {
		this.officeCode = officeCode;
		this.branchCode = branchCode;
		this.instructionData = instructionData;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public InstructionData getInstructionData() {
		return instructionData;
	}

	public void setInstructionData(InstructionData instructionData) {
		this.instructionData = instructionData;
	}

}
