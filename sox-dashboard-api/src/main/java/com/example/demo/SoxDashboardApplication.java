package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class SoxDashboardApplication {

	public static void main(String[] args){
		SpringApplication.run(SoxDashboardApplication.class, args);
		String url ="jdbc:mysql://localhost:3306/enco?autoReconnect=true&useSSL=false";
		String user ="root";
		String password ="encodatenbank";
		try {
			Connection myConn = DriverManager.getConnection(url, user, password);
			Statement myStat = myConn.createStatement();
			String sql = "select * from project";
			ResultSet rs = myStat.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("pname"));
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}
