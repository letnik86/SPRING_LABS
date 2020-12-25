package ru.specialist.DAO;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userVM")
public class UserVM {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getHello() {
		return (getUserName() == null || getUserName().isEmpty()) ? "Привет!" :
			String.format("Привет, %s!", getUserName());
	}
	

}
