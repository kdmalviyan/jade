package com.interoperability.users;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.interoperability.stocks.Stock;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String username;
	private String password;
	private List<Stock> portfolio;
	private String errorMessage;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Stock> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<Stock> portfolio) {
		this.portfolio = portfolio;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
