package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.ListInterfaces;

public class LinkedListClass implements ListInterfaces {

	static LinkedListClass lc;

	private List<String> linkedList;

	private LinkedListClass() {
		this.linkedList = new ArrayList<String>();
	}

	public static LinkedListClass getInstance() {
		if (lc != null) {
			return lc;
		}
		lc = new LinkedListClass();
		return lc;
	}

	@Override
	public void insertElement() {
		System.out.println("Enter the new record :-");
		this.linkedList.add(GetInput.getInstance().getNewRecord());
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void insertMutipleElement() {
		System.out.println("Enter the limit of entired records ");
		int limit = GetInput.getInstance().getChoiceNo();
		System.out.println("Enter the " + limit + "records ");
		for (int i = 0; i < limit; i++) {
			this.linkedList.add(GetInput.getInstance().getNewRecord());

		}
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void updateElement() {
		System.out.println("Enter the update record ");
		String olEl = GetInput.getInstance().getNewRecord();
		if (this.linkedList.contains(olEl)) {
			System.out.println("Enter the new element for replace this :" + olEl);
			String nwEl = GetInput.getInstance().getNewRecord();

			for (int i = 0; i < this.linkedList.size(); i++) {
				if (this.linkedList.get(i).toString().equals(olEl)) {

					this.linkedList.set(i, nwEl);
					System.out.println("record update successfully !!!");
					break;
				}
			}
		} else {
			System.out.println(olEl + "this data is not available in records , So please try again");
			updateElement();
		}
	}

	@Override
	public void retrieve() {
		if (this.linkedList.isEmpty()) {
			System.out.println("There is no records ");
			return;
		}
		for (String x : this.linkedList) {
			System.out.println(x);
		}
	}

	@Override
	public void retrieveFirstAndLastElement() {
		if (this.linkedList.size() > 0)
			System.out.println(this.linkedList.get(0) + " and " + this.linkedList.get(this.linkedList.size() - 1));

	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete ");
		String el = GetInput.getInstance().getNewRecord();
		if (linkedList.contains(el)) {
			linkedList.remove(el);
			System.out.println("Opration successfully  done !!!");

		} else {
			System.out.println("Record not found !!!");
		}
	}

	@Override
	public void deleteAllElement() {
		this.linkedList.clear();
		System.out.println("Opration successfully done !!!");
	}

	@Override
	public void deleteSameElementButSaveOne() {
		Set<String> set = new HashSet<String>(this.linkedList);
		this.linkedList.clear();
		this.linkedList.addAll(set);
	}
 
	@Override
	public void shortElement() {
		this.linkedList = this.linkedList.stream().sorted().collect(Collectors.toList());
		System.out.println(this.linkedList);
	}
}
