package com.handler;

public class MSGHandlerOfList {

	static MSGHandlerOfList msgHandlerOfList;

	public static MSGHandlerOfList getInstance() {
		if (msgHandlerOfList != null) {
			return msgHandlerOfList;
		}
		msgHandlerOfList = new MSGHandlerOfList();
		return msgHandlerOfList;
	}

	public void showListDataStructure() {
		System.out.println("Select one Data Structure according of list to our required ");
		System.out.println("1. ArrayList");
		System.out.println("2. LinkedList");
		System.out.println("3. Vector");
		System.out.println("4. Stack");

	}

	public void showOprationsOfList() {
		System.out.println("Select one operation  ");
		System.out.println("1. Instert record");
		System.out.println("2. Instert multiple records");
		System.out.println("3. Update record");
		System.out.println("4. Show records");
		System.out.println("5. Show records use start index and last index");
		System.out.println("6. Remove record");
		System.out.println("7. Remove all record");
		System.out.println("8. Remove all same records but save one");
		System.out.println("9. Set all record in sequence");
	}

}
