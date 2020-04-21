package io.swagger.model;

import java.util.List;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Users")
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(localName = "Student")
	@JacksonXmlElementWrapper(useWrapping = false)
	protected List<User> users = null;
	protected List<LocalDateTime> loginTime = null;

	public List<User> getStudents() {
		return users;
	}

	public void setStudents(List<User> students) {
		this.users = students;
	}
	
	public List<LocalDateTime> getLoginTime() {
		return loginTime;
	}

	public void setgetLoginTime(List<LocalDateTime> times) {
		this.loginTime = times;
	}
	
}