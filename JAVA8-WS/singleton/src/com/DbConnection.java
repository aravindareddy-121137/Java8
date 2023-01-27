package com;

public class DbConnection {
	
	private DbConnection() {
		System.out.println("DbConnection object created on "+this.hashCode());
	}
	
	private static DbConnection con=null;
	
	public static DbConnection getConnection() {
		
		if(con==null) {
			con=new DbConnection();
		}
		
		return con;
	
	}
	
	
	public void fetchData() {
		System.out.println("fetching data from database....");
	}
	
	
	

}
