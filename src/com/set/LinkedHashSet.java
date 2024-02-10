package com.set;

import java.util.Set;

import com.input.GetInput;
import com.interface1.SetInteraces;

public class LinkedHashSet implements SetInteraces {

	private Set<String> linkedHashSet;

	private static LinkedHashSet lhsc;

	private LinkedHashSet() {
		this.linkedHashSet = new java.util.LinkedHashSet<>();
	}

	public static LinkedHashSet getInstance() {
		if (lhsc != null) {
			return lhsc;
		}
		lhsc = new LinkedHashSet();
		return lhsc;
	}

	@Override
	public void insertElement() {
		System.out.println("Enter the new record :- ");
		this.linkedHashSet.add(GetInput.getInstance().getNewRecord());
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void insertMultipleElement() {
		System.out.println("Enter the limit of entered records ");
		int limit = GetInput.getInstance().getChoiceNo();
		System.out.println("Enter the " + limit + " records ");
		for (int i = 0; i < limit; i++) {
			this.linkedHashSet.add(GetInput.getInstance().getNewRecord());
		}
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void updateElement() {
		System.out.println("Enter the update record");
		String oldEl = GetInput.getInstance().getNewRecord();
		if (this.linkedHashSet.contains(oldEl)) {
			System.out.println("Enter the new element for replacing this: " + oldEl);
			String newEl = GetInput.getInstance().getNewRecord();

			this.linkedHashSet.remove(oldEl);
			this.linkedHashSet.add(newEl);

			System.out.println("Record updated successfully !!!!");
		} else {
			System.out.println(oldEl + " this data is not present in records, so please try again");
			updateElement();
		}
	}

	@Override
	public void retrieve() {
		if (this.linkedHashSet.isEmpty()) {
			System.out.println("There are no records");
			return;
		}

		for (String x : this.linkedHashSet) {
			System.out.println(x);
		}
	}

	@Override
	public void retrieveFirstAndLastElement() {
		if (!this.linkedHashSet.isEmpty()) {
			String[] array = this.linkedHashSet.toArray(new String[0]);
			System.out.println(array[0] + " and " + array[array.length - 1]);
		}
	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete");
		String el = GetInput.getInstance().getNewRecord();
		if (linkedHashSet.contains(el)) {
			linkedHashSet.remove(el);
			System.out.println("Operation successfully done !!!!");
		} else {
			System.out.println("Record not found !!!!");
		}
	}

	@Override
	public void deleteAllElement() {
		this.linkedHashSet.clear();
		System.out.println("Operation successfully done !!!!");
	}

	@Override
	public void shortElement() {
		System.out.println(this.linkedHashSet);
	}

}
