package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.ListInterfaces;

public class VectorClass implements ListInterfaces {

	static VectorClass vc;

	private List<String> vectorClass;

	private VectorClass() {
		this.vectorClass = new ArrayList<String>();
	}

	public static VectorClass getInstance() {
		if (vc != null) {
			return vc;
		}
		vc = new VectorClass();
		return null;
	}

	@Override
	public void insertElement() {
		System.out.println("Enter the new record :-");
		this.vectorClass.add(GetInput.getInstance().getNewRecord());
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void insertMutipleElement() {
		System.out.println("Enter the limit of entired records ");
		int limit = GetInput.getInstance().getChoiceNo();
		System.out.println("Enter the " + limit + "records ");
		for (int i = 0; i < limit; i++) {
			this.vectorClass.add(GetInput.getInstance().getNewRecord());
		}
		System.out.println("Record added successfully !!!");
	}

	@Override
	public void updateElement() {
		System.out.println("Enter the update record ");
		String olEl = GetInput.getInstance().getNewRecord();
		if (this.vectorClass.contains(olEl)) {
			System.out.println("Enter the new element for replace this :" + olEl);
			String nwEl = GetInput.getInstance().getNewRecord();

			for (int i = 0; i < this.vectorClass.size(); i++) {
				if (this.vectorClass.get(i).toString().equals(olEl)) {

					this.vectorClass.set(i, nwEl);
					System.out.println("reocrd update successfully !!!");
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
		if (this.vectorClass.isEmpty()) {
			System.out.println("There is no records ");
			return;
		}
		for (String x : this.vectorClass) {
			System.out.println(x);
		}
	}

	@Override
	public void retrieveFirstAndLastElement() {
		if (this.vectorClass.size() > 0)

			System.out.println(this.vectorClass.get(0) + "and" + this.vectorClass.get(this.vectorClass.size() - 1));
	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete ");
		String el = GetInput.getInstance().getNewRecord();
		if (vectorClass.contains(el)) {
			vectorClass.remove(el);
			System.out.println("Operation Successfully done !!!");

		} else {
			System.out.println("Record not found !!!");
		}
	}

	@Override
	public void deleteAllElement() {
		this.vectorClass.clear();
		System.out.println("Operation successfully done !!!");
	}

	@Override
	public void deleteSameElementButSaveOne() {
		Set<String> set = new HashSet<String>(this.vectorClass);
		this.vectorClass.clear();
		this.vectorClass.addAll(set);
	}

	@Override
	public void shortElement() {
		this.vectorClass = this.vectorClass.stream().sorted().collect(Collectors.toList());
		System.out.println(this.vectorClass);
	}
}
