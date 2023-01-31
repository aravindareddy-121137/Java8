package com;

public class MainApp {
	
	public static void main(String[] args) {
		
		MySQLDB mySql=new MyClass();
		mySql.connect();
		
		OracleDB oracleDb=new MyClass();
		oracleDb.connect();
		
		
		
	}

}
