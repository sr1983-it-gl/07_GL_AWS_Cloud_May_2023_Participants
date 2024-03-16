package com.itcorp.books;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryRecordsDemo {

	public static void main(String[] args) {
		
		String mySqlDriverClassName 
		= ApplicationConstants.DRIVER_CLASS_NAME;
		
		try {
			Class.forName(mySqlDriverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String connectionUrl = ApplicationConstants.CONNECTION_URL;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			
			connection = DriverManager.getConnection(
				connectionUrl,
				ApplicationConstants.USERNAME,
				ApplicationConstants.PASSWORD);

			System.out.println("Database Connection DONE");
			
			statement = connection.createStatement();

			String selectQuery 
				= "select Book_id, author_name, title, publication_year from books";
			
			resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()) {
				
				int bookId = resultSet.getInt(1);
				String authorName = resultSet.getString(2);
				String bookTitle = resultSet.getString(3);
				int publicationYear = resultSet.getInt(4);
				
				System.out.println(String.format(
					"Book Name is '%s', Author name is '%s'"
					+ " and Publication Year is %d", 
						
					new Object[] {
						bookTitle, 
						authorName, 
						Integer.valueOf(publicationYear)}
					));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
			
	}
}
