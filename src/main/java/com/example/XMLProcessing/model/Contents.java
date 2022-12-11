package com.example.XMLProcessing.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Contents")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contents implements Serializable {
	
	private static final long serialVersionUID = 7634116265106201717L;
	@XmlElement(name = "messageSubject")
	public String messageSubject;
	@XmlElement(name = "PaymentControlDataNo")
	public PaymentControlDataNo paymentControlDataNo;
	
	public Contents() {	
	}
	public Contents(String messageSubject, PaymentControlDataNo paymentControlDataNo) {	
		this.messageSubject = messageSubject;
		this.paymentControlDataNo = paymentControlDataNo;
	}
	public String getMessageSubject() {
		return messageSubject;
	}
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}
	public PaymentControlDataNo getPaymentControlDataNo() {
		return paymentControlDataNo;
	}
	public void setPaymentControlDataNo(PaymentControlDataNo paymentControlDataNo) {
		this.paymentControlDataNo = paymentControlDataNo;
	}	
	
}
