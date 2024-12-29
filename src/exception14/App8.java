package exception14;

public class App8 {

	public static void main(String[] args) {

		//		try  {
//			System.out.println("inside try");
//			int result = 10 / 0;
//		}
//		finally {
//
//			System.out.println("inside finally");
//		}
//		System.out.println("outside try-finally");

//		try finally wala print chalega baad wala nahi , use try finally When you don't need to handle the exception
//		in the current method but still need to release resources, e.g., closing files, releasing locks, etc.
//	}


// 	Connection connection= null;
//	try{
//		connection = DriverAction.getConnectiom("jdbc:mysql://localhost:3306/mydb", "user", "password");
//	}
//	finally{
//		if(connection != null)
//			try{
//				connection.close();
//			}catch (SQLException e){
//				e.printStackTrace();
//			}
//	}


/*		class DatabaseConnectionExample {

				// Step 1: Define database connection details
				String url = "jdbc:mysql://localhost:3306/yourDatabaseName";
				String username = "yourUsername";
				String password = "yourPassword";

				// Step 2: Initialize connection object
				Connection connection = null;

				try {
					System.out.println("Step 3: Attempting to connect to the database...");

					// Step 4: Establish connection
					connection = DriverManager.getConnection(url, username, password);
					System.out.println("Step 4: Database connection established successfully!");

					// Add database query execution here, if any
				} catch (SQLException e) {
					// Step 5: Handle connection failure
					System.err.println("Step 5: Failed to connect to the database.");
					System.err.println("Error: " + e.getMessage());
				} finally {
					System.out.println("Step 6: Attempting to close the connection...");
					if (connection != null) {
						try {
							connection.close();
							System.out.println("Step 6: Database connection closed successfully.");
						} catch (SQLException e) {
							System.err.println("Step 6: Failed to close the connection.");
							System.err.println("Error: " + e.getMessage());
						}
					} else {
						System.out.println("Step 6: Connection was never established, nothing to close.");
					}
				}

		}*/



		try  {
			System.out.println("inside try");
			int result = 10 / 0;
		}
		finally {
			System.exit(0);
			System.out.println("inside finally");
		}
		System.out.println("outside try-finally");
	}

	// this is interesting case where finally block and rest code will not execute


}


