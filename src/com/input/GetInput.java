package com.input;

import java.util.Scanner;

public class GetInput {

	static GetInput gi;

	private Scanner sc;

	public GetInput() {
		sc = new Scanner(System.in);
	}

	public static GetInput getInstance() {
		if (gi != null) {
			return gi;
		}
		gi = new GetInput();
		return gi;
	}

	public String getNewRecord() {
		return sc.next();
	}

	public int getChoiceNo() {
		int x;
		try {
			x = sc.nextInt();
		} catch (Exception e) {
			x = getChoiceNo();
		}
		return x;
	}

	public String getYesOrNo() {
		String choice2;
		String choice = this.sc.next();
		if (choice.equals("y") || choice.equals("Y") || choice.equals("n") || choice.equals("N")) {
			choice2 = choice;
		} else {
			System.out.println("Your key is wrong please press y/n");
			choice2 = getYesOrNo();
		}
		return choice2;

	}

}
