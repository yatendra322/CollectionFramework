package com.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.SetInteraces;

public class HashSetClass implements SetInteraces {

	private Set<String> hashSet;

	private static HashSetClass hsc;

	private HashSetClass() {
		this.hashSet = new HashSet<>();
	}

	public static HashSetClass getInstance() {
		if (hsc != null) {
			return hsc;
		}
		hsc = new HashSetClass();
		return hsc;
	}

	@Override
	public void insertElement() {
		System.out.println("Enter the new record :- ");
		this.hashSet.add(GetInput.getInstance().getNewRecord());
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void insertMultipleElement() {
		System.out.println("Enter the limit of entered records ");
		int limit = GetInput.getInstance().getChoiceNo();
		System.out.println("Enter the " + limit + " records ");
		for (int i = 0; i < limit; i++) {
			this.hashSet.add(GetInput.getInstance().getNewRecord());
		}
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void updateElement() {
		System.out.println("Enter the update record");
		String oldEl = GetInput.getInstance().getNewRecord();
		if (this.hashSet.contains(oldEl)) {
			System.out.println("Enter the new element for replacing this: " + oldEl);
			String newEl = GetInput.getInstance().getNewRecord();

			this.hashSet.remove(oldEl);
			this.hashSet.add(newEl);

			System.out.println("Record updated successfully !!!!");
		} else {
			System.out.println(oldEl + " this data is not present in records, so please try again");
			updateElement();
		}
	}

	@Override
	public void retrieve() {
		if (this.hashSet.isEmpty()) {
			System.out.println("There are no records");
			return;
		}

		for (String x : this.hashSet) {
			System.out.println(x);
		}
	}

	@Override
	public void retrieveFirstAndLastElement() {
		if (!this.hashSet.isEmpty()) {
			String[] array = this.hashSet.toArray(new String[0]);
			System.out.println(array[0] + " and " + array[array.length - 1]);
		}
	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete");
		String el = GetInput.getInstance().getNewRecord();
		if (hashSet.contains(el)) {
			hashSet.remove(el);
			System.out.println("Operation successfully done !!!!");
		} else {
			System.out.println("Record not found !!!!");
		}
	}

	@Override
	public void deleteAllElement() {
		this.hashSet.clear();
		System.out.println("Operation successfully done !!!!");
	}

	@Override
	public void shortElement() {
		List<String> sortedList = this.hashSet.stream().sorted().collect(Collectors.toList());

		Set<String> sortedSet = new HashSet<>(sortedList);
		System.out.println(sortedSet);

	}
}
