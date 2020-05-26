package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Course;

public class Service {
	private Course info;

	public Course getInfo() {
		return info;
	}


	public void setInfo(Course info) {
		this.info = info;
	}
	
	
	
}
