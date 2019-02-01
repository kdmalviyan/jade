package com.interoperability.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.interoperability.db.DBConnectionManager;
import com.interoperability.stocks.Stock;

@Stateless
@WebService
public class UserManagementService {

	@WebMethod(operationName = "login")
	public User login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
		User user = this.findUser(username);
		if (user == null) {
			user = new User();
			user.setErrorMessage("User Does not exists");
		} else if (user.getPassword().equals(password)) {
			return user;
		} else {
			user = new User();
			user.setErrorMessage("Wrong credentials");
		}
		System.out.println("Username " + username + " => Password " + password);
		return user;
	}

	@WebMethod(operationName = "register")
	public User register(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
		User user = null;
		try (Connection con = DBConnectionManager.getConnection()) {
			user = findUser(username);
			if (user != null) {
				user = new User();
				user.setErrorMessage("User Already Registered");
			} else {
				PreparedStatement preparedStatement = con
						.prepareStatement("INSERT INTO User(username, password) VALUES(?,?)");
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				if (preparedStatement.executeUpdate() > 0) {
					user = findUser(username);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Username " + username + " => Password " + password);
		return user;
	}

	@WebMethod(operationName = "addStock")
	public boolean addStock(@WebParam(name = "stock") Stock stock, @WebParam(name = "username") String username) {
		return true;
	}

	@WebMethod(operationName = "removeStock")
	public boolean remove(@WebParam(name = "stockId") long stockId, @WebParam(name = "username") String username) {
		return true;
	}

	private User findUser(String username) {
		User user = null;
		try (Connection con = DBConnectionManager.getConnection()) {
			String query = "SELECT * FROM User Where username=?";
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, username);
			ResultSet rset = preparedStatement.executeQuery();
			if (rset.next()) {
				user = new User();
				user.setUsername(username);
				user.setId(rset.getInt("id"));
				user.setPassword(rset.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
