package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.ListInterfaces;

public class StackClass implements ListInterfaces{
	
	static StackClass sc;
	
	private List<String> stackclass;
	
	private StackClass() {
		this.stackclass=new ArrayList<String>();
	}
	
	public static StackClass getInstance() {
		if(sc!=null) {
			return sc;
		}
		sc=new StackClass();
		return sc;
	}

	@Override
	public void insertElement() {
System.out.println("Enter the record :-");
this.stackclass.add(GetInput.getInstance().getNewRecord());
System.out.println("Record added successfully !!!");
	}

	@Override
	public void insertMutipleElement() {
       System.out.println("Enter the limit of entired records ");
       int limit=GetInput.getInstance().getChoiceNo();
       System.out.println("Enter the " +limit + " records");
       for(int i=0;i<limit;i++) {
    	   this.stackclass.add(GetInput.getInstance().getNewRecord());
       }
       System.out.println("Record added successfully !!!");
       
	}

	@Override
	public void updateElement() {
      System.out.println("Enter the update record ");
      String olEl=GetInput.getInstance().getNewRecord();
      if(this.stackclass.contains(olEl)) {
    	  System.out.println("Enter the new element for replace this :"+olEl);
    	  String nwEl=GetInput.getInstance().getNewRecord();
    	  
    	  for(int i=0;i<this.stackclass.size();i++) {
    		  if(this.stackclass.get(i).toString().equals(olEl)) {
    			  this.stackclass.set(i, nwEl);
    			  System.out.println("record update successfully !!");
    			  break;
    		  }
    	  }
      }else {
    	  System.out.println(olEl+" this data is not available in records , So please try again");
    	  updateElement();
      }
	}

	@Override
	public void retrieve() {
      if(this.stackclass.isEmpty()) {
    	  System.out.println("There is no records ");
    	  return ;
      }
      for(String x : this.stackclass) {
    	  System.out.println(x);
      }
	}

	@Override
	public void retrieveFirstAndLastElement() {
      if(this.stackclass.size()>0)
    	  System.out.println(this.stackclass.get(0) +"and " +this.stackclass.get(this.stackclass.size()-1));
	}

	@Override
	public void deleteElement() {
		System.out.println("Enter the record for delete");
		String el= GetInput.getInstance().getNewRecord();
		if(stackclass.contains(el)) {
			stackclass.remove(el);
			System.out.println("Operation Successfully !!!");
		}else {
			System.out.println("Record not found !!!");
		}
		
	}

	@Override
	public void deleteAllElement() {
	  this.stackclass.clear();
	  System.out.println("Opeartion Successfully done !!!");
	}

	@Override
	public void deleteSameElementButSaveOne() {
		Set<String> set=new HashSet<String>(this.stackclass);
		this.stackclass.clear();
		this.stackclass.addAll(set);
		
	}

	@Override
	public void shortElement() {
		this.stackclass=this.stackclass.stream().sorted().collect(Collectors.toList());
		System.out.println(this.stackclass);
		
	}

}
