package com.Universities.Exception;

import java.util.Date;

public class ExceptionModel {
	
	private Date TimeStamp;
	private String Message;
	private String Status;
	private String path;
	
	
	public ExceptionModel() {
		super();
	}
	public ExceptionModel(Date timeStamp, String message, String status, String path) {
		super();
		TimeStamp = timeStamp;
		Message = message;
		Status = status;
		this.path = path;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ExceptionModel [TimeStamp=" + TimeStamp + ", Message=" + Message + ", Status=" + Status + ", path="
				+ path + "]";
	}
	
	
}
