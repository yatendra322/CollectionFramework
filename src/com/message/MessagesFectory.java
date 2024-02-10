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
		System.out.println("2. Queue");
		System.out.println("3. Dqueue");
		System.out.println("4. Set");
		System.out.println("5. ShortedSet");
		System.out.println("6. Map");
		System.out.println("7. ShortedMap");
		
	}
	
	

}
