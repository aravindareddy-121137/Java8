package com;

public class MyClass implements OracleDB,MySQLDB{

	@Override
	public void connect() {
		System.out.println("Connected to DB with  "+this.getClass().getName());
		
	}
}
