package com.subhash.creational.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
//		DBConnection dbConn = DBConnection.getInstance();
//		System.out.println("The Counter is " + dbConn.getCounter());
		
		
		for(int i=0;i<20;i++){
			new Thread(()->
			{  
				DBConnection dbConn = DBConnection.getInstance();
//				System.out.println("The Counter is " + dbConn.getCounter());
				System.out.println("The Object id is " + System.identityHashCode(dbConn) + " And Counter is "+ dbConn.getCounter());
				
			}).start();
		}
	}
	
}
