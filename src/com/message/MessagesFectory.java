package com.message;

public class MessagesFectory {

	static MessagesFectory alc;

	public static MessagesFectory getIntance() {
		if (alc != null) {
			return alc;
		}
		alc =new MessagesFectory();
		return alc;
	}
	
	public void showDataStructure() {
		System.out.println("Select one Data Structure according to our required ");
		System.out.println("1. List");
		System.out.println("2. Set");
		System.out.println("3. Queue");
		
	}
	
	

}
