package com.cg.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int messageId;
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
}