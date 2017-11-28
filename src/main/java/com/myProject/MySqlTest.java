package com.myProject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MySqlTest {
	
	public static void setConn() throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3311/online_bookstore","root","root");
		Statement test = con.createStatement();
		String qry = "select * from customer";
		ResultSet id = test.executeQuery(qry);
		while (id.next()){
            System.out.println(id.getString("email"));
        }
	}
	
	public static void main(String[] args) throws SQLException{
		setConn();
		System.out.println("ok");
	}

}
