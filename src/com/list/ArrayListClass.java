package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.ListInterfaces;

public class ArrayListClass implements ListInterfaces {

	private List<String> arrayList;

	static ArrayListClass alc;

	private ArrayListClass() {
		this.arrayList = new ArrayList<String>();
	}

	public static ArrayListClass getIntance() {
		if (alc != null) {
			return alc;
		}
		alc = new ArrayListClass();
		return alc;
	}

	@Override
	public void insertElement() {
		System.out.println("Enter the new record :- ");
		this.arrayList.add(GetInput.getInstance().getNewRecord());
		System.out.println("Record added successfully !!!");

	}

	@Override
	public void insertMutipleElement() {
		System.out.println("Enter the limit of entired records ");
		int limit = GetInput.getInstance().getChoiceNo();
		System.out.println("Enter the " + limit + " records ");
		for (int i = 0; i < limit; i++) {
			this.arrayList.add(GetInput.getInstance().getNewRecord());
		}
		System.out.println("Record added successfully !!!");

	}

	@Override
	public void updateElement() {
		System.out.println("Enter the update record");
		String olEl = GetInput.getInstance().getNewRecord();
		if (this.arrayList.contains(olEl)) {
			System.out.println("Enter the new element for replace this : " + olEl);
			String nwEl = GetInput.getInstance().getNewRecord();

			for (int i = 0; i < this.arrayList.size(); i++) {

				if (this.arrayList.get(i).toString().equals(olEl)) {

					this.arrayList.set(i, nwEl);

					System.out.println("record updated successfully  !!!! ");
					break;
				}
			}

		} else {
			System.out.println(olEl + "this data is not present in records, So Please try again");
			updateElement();
		}

	}

	@Override
	public void retrieve() {

		if (this.arrayList.isEmpty()) {
			System.out.println("There is no recurds");
			return;
		}

		for (String x : this.arrayList) {
			System.out.println(x);
		}

	}

	@Override
	public void retrieveFirstAndLastElement() {
		if (this.arrayList.size() > 0)
			System.out.println(this.arrayList.get(0) + " and " + this.arrayList.get(this.arrayList.size() - 1));
	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete");
		String el = GetInput.getInstance().getNewRecord();
		if (arrayList.contains(el)) {

			arrayList.remove(el);
			System.out.println("Opration successfully done !!!!");
		} else {
			System.out.println("Record not found !!!!!");
		}
	}

	@Override
	public void deleteAllElement() {
		this.arrayList.clear();
		System.out.println("Opration successfully done !!!!");

	}

	@Override
	public void deleteSameElementButSaveOne() {
		Set<String> set = new HashSet<String>(this.arrayList);
		this.arrayList.clear();
		this.arrayList.addAll(set);
	}

	@Override
	public void shortElement() {
		this.arrayList = this.arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(this.arrayList);

	}

}
