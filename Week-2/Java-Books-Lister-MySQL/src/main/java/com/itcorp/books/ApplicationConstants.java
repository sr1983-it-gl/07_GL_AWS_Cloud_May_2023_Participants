package com.itcorp.books;

public class ApplicationConstants {

	public static String DRIVER_CLASS_NAME 
		= "com.mysql.cj.jdbc.Driver";
	
	public static String SERVER_NAME = "localhost";
	
	public static int DB_PORT = 4444;
	
//	public static int DB_PORT = 3306;

	public static String DB_NAME = "books_db";	
	
	public static String CONNECTION_URL
		= String.format("jdbc:mysql://%s:%d/%s", 
				SERVER_NAME, DB_PORT, DB_NAME);

//	public static String USERNAME = "book_user";
	public static String USERNAME = "root";
	
//	public static String PASSWORD = "password_123";
	public static String PASSWORD = "mypassword_11";

}
