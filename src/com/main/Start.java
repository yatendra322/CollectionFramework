package com.main;

import com.handler.ConditionHandler;
import com.message.MessagesFectory;

public class Start {

	public static void main(String[] args) {
		System.out.println("********************* Welcome to Collection Game *************");
		
		ConditionHandler.getInstance().dataStructureHandler();
	}
	
	public static void again() {
		ConditionHandler.getInstance().dataStructureHandler();
	}

}
