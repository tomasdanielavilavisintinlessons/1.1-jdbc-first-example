package com.example.jdbcFirstExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MysqlDataSource myds = new MysqlDataSource();
    	myds.setUser("root");
    	myds.setPassword("root");
    	myds.setPort(3006);
    	myds.setUrl("jdbc:mysql://localhost:3306/jdbcexampledb");
    	
    	try(Connection con = myds.getConnection()) {
    		Statement st = con.createStatement();
    		
    		String query = "select * from users";
    		
    		ResultSet result = st.executeQuery(query);
    		
    		System.out.println("Users:");
    		
    		while(result.next()) {
    			int id = result.getInt("id");
    			String name = result.getString("name");
    			int age = result.getInt("age");
    			String gender = result.getBoolean("gender") ? "Female" : "Male";
    			
    			System.out.println(String.format("%d- %s, %s, %d years old", id, name, gender, age));
    		}
    		
    		// Chiusura 
    		result.close();
    		st.close();
    		con.close();
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
    		
			e.printStackTrace();
		}
    }
}
