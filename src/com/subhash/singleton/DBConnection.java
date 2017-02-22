package com.subhash.singleton;

public class DBConnection {

	private static int counter = 0;

	private static DBConnection dbConn;

	private DBConnection() {
		DBConnection.counter++;
	}

	public static DBConnection getInstance() {

		if (dbConn == null) {
			
			synchronized (DBConnection.class) {
				if(dbConn == null){
					dbConn = new DBConnection();
				}
			}
				
		}

		return dbConn;
	}

	public int getCounter() {
		return DBConnection.counter;
	}

}
