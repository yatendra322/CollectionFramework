package com.handler;

import com.input.GetInput;
import com.list.ArrayListClass;
import com.main.Start;
import com.message.MessagesFectory;

public class ConditionHandler {

	static ConditionHandler condHnlr;

	public static ConditionHandler getInstance() {
		if (condHnlr != null) {
			return condHnlr;
		}
		condHnlr = new ConditionHandler();
		return condHnlr;
	}

	public void dataStructureHandler() {

		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MessagesFectory.getIntance().showDataStructure();
			int x = GetInput.getInstance().getChoiceNo();
			if (x == 1) {
				listDataStructureHandler();
			} else if (x == 2) { // for Set Data structure
				setDataStructureHandler();
			} else if (x == 3) { // for Queue Data structure
				
			} else if (x == 4) { // for Map Data structure
				mapDataStructureHandler();
			}
			System.out.println("Do you want any other operation, press y/n ! Go for main manu press m ");
			con = GetInput.getInstance().getYesOrNo();
			if ((con.equals("m") || con.equals("M"))) {
				Start.again();
				break;
			}
		}
		if ((con.equals("n") || con.equals("N"))) {
			Start.again();
		}
	}

	public void listDataStructureHandler() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.getInstance().showListDataStructure();
			int x = GetInput.getInstance().getChoiceNo();
			if (x == 1) {
				arrayListOparation();
			} else if (x == 2) {
				linkedListOparation();
			}
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
		if ((con.equals("n") || con.equals("N"))) {
			dataStructureHandler();
		}
	}

	public void setDataStructureHandler() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.getInstance().showSetDataStructure();
			int x = GetInput.getInstance().getChoiceNo();
			if (x == 1) {
				hashSetOparation();
			} else if (x == 2) {
				linkedHashSetOparation();
			}
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
		if ((con.equals("n") || con.equals("N"))) {
			dataStructureHandler();
		}
	}
	
	public void mapDataStructureHandler() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.getInstance().showListDataStructure();
			int x = GetInput.getInstance().getChoiceNo();
			if (x == 1) {
				hashMapOparation();
			} else if (x == 2) {
				linkedHashMapOparation();
			}
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
		if ((con.equals("n") || con.equals("N"))) {
			dataStructureHandler();
		}
	}

	public void arrayListOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOprationsOfList();
			int x = GetInput.getInstance().getChoiceNo();
			if (x == 1) {
				ArrayListClass.getIntance().insertElement();
			} else if (x == 2) {
				ArrayListClass.getIntance().insertMutipleElement();
			} else if (x == 3) {
				ArrayListClass.getIntance().updateElement();
			} else if (x == 4) {
				ArrayListClass.getIntance().retrieve();
			} else if (x == 5) {
				ArrayListClass.getIntance().retrieveFirstAndLastElement();
			} else if (x == 6) {
				ArrayListClass.getIntance().deleteElement();
			} else if (x == 7) {
				ArrayListClass.getIntance().deleteAllElement();
			} else if (x == 8) {
				ArrayListClass.getIntance().deleteSameElementButSaveOne();
			} else if (x == 9) {
				ArrayListClass.getIntance().shortElement();
			}
			System.out.println("Do you want any other operation, press y/n ! Go for main manu press m ");
			con = GetInput.getInstance().getYesOrNo();
			if ((con.equals("m") || con.equals("M"))) {
				Start.again();
				break;
			}
		}
	}

	public void linkedListOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOprationsOfList();
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
	}

	public void hashSetOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOperationOfSet();
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
	}

	public void linkedHashSetOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOperationOfSet();
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
	}
	
	public void hashMapOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOperationOfSet();
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
	}
	
	public void linkedHashMapOparation() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MSGHandlerOfList.msgHandlerOfList.showOperationOfSet();
			System.out.println("Do you want any other operation, press y/n");
			con = GetInput.getInstance().getYesOrNo();
		}
	}
}
