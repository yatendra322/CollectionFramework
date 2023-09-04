package com.list;

import java.util.ArrayList;
import java.util.List;

import com.interface1.ListInterfaces;

public class VectorClass implements ListInterfaces{
	
	static VectorClass vc;
	
	private List<String> vectorClass;
	
	private VectorClass() {
		this.vectorClass=new ArrayList<String>();
	}
public static VectorClass getInstance() {
		if(vc!=null) {
			return vc;
		}
		vc=new VectorClass();
		return null;
		
	}

	@Override
	public void insertElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMutipleElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveFirstAndLastElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSameElementButSaveOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shortElement() {
		// TODO Auto-generated method stub
		
	}

}
