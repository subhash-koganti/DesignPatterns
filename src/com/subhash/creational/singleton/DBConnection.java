package com.subhash.creational.singleton;

public class DBConnection {

	private static int counter = 0;

	private static DBConnection dbConn;

	private DBConnection() {
		DBConnection.counter++;
	}

	public static DBConnection getInstance() {

		if (dbConn == null) { // At this level its not thread safe.
			synchronized (DBConnection.class) { 
				// At this level, its threadsafe. Instead of making the whole getInstance method synchronized, we just need to make the part where
				// first object is created , as synchronized. so this class is thread safe only until first object is created.
				if (dbConn == null) {
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
