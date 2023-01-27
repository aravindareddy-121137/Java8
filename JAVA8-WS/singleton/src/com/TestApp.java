package com;

public class TestApp {

	public static void main(String[] args) {
		
		//DbConnection c1=new DbConnection();
		//DbConnection c2=new DbConnection();
		//DbConnection c3=new DbConnection();
		//DbConnection c4=new DbConnection();
		
		DbConnection c1=DbConnection.getConnection();
		DbConnection c2=DbConnection.getConnection();
		DbConnection c3=DbConnection.getConnection();
		DbConnection c4=DbConnection.getConnection();
		
		c1.fetchData();
		c2.fetchData();
		c3.fetchData();
		c4.fetchData();
		
		
		
		

	}

}
