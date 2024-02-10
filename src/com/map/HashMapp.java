package com.map;

import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;

import com.input.GetInput;
import com.interface1.MapInterface;

public class HashMapp implements MapInterface{

	
	 private Map<String, String> hashMap;

	    private static HashMapp hm;

	    private HashMapp() {
	        this.hashMap = new HashMap<>();
	    }
	    
	    public static HashMapp getInstance() {
	        if (hm != null) {
	            return hm;
	        }
	        hm = new HashMapp();
	        return hm;
	    }

		@Override
		public void insertKeyValue(String key, String value) {
			 System.out.println("Enter the new record (both key and value): ");
		        String newRecord = GetInput.getInstance().getNewRecord();
		        String[] keyValue = newRecord.split(" ");
		        if (keyValue.length == 2) {
		            this.hashMap.put(keyValue[0], keyValue[1]);
		            System.out.println("Record added successfully !!!");
		        } else {
		            System.out.println("Invalid input format. Please provide both key and value.");
		        }
		}

		@Override
		public void insertMultipleKeyValue(Map<String, String> keyValueMap) {
			System.out.println("Enter the limit of entered records ");
	        int limit = GetInput.getInstance().getChoiceNo();
	        System.out.println("Enter the records (both key and value) separated by space: ");
	        for (int i = 0; i < limit; i++) {
	            String newRecord = GetInput.getInstance().getNewRecord();
	            String[] keyValue = newRecord.split(" ");
	            if (keyValue.length == 2) {
	                this.hashMap.put(keyValue[0], keyValue[1]);
	            } else {
	                System.out.println("Invalid input format. Skipping record.");
	            }
	        }
	        System.out.println("Records added successfully !!!");
		}

		@Override
		public void updateValueForKey(String key, String newValue) {
			 System.out.println("Enter the update record (both key and value): ");
		        String oldRecord = GetInput.getInstance().getNewRecord();
		        String[] oldKeyValue = oldRecord.split(" ");
		        if (oldKeyValue.length == 2 && this.hashMap.containsKey(oldKeyValue[0])) {
		            System.out.println("Enter the new element for replacing this (both key and value): ");
		            String newRecord = GetInput.getInstance().getNewRecord();
		            String[] newKeyValue = newRecord.split(" ");
		            if (newKeyValue.length == 2) {
		                this.hashMap.remove(oldKeyValue[0]);
		                this.hashMap.put(newKeyValue[0], newKeyValue[1]);
		                System.out.println("Record updated successfully !!!");
		            } else {
		                System.out.println("Invalid input format. Please provide both key and value.");
		            }
		        } else {
		            System.out.println("Record not found or invalid input format. Please try again.");
		        }
		}

		@Override
		public void retrieveAllEntries() {
			  if (this.hashMap.isEmpty()) {
		            System.out.println("There are no records");
		        } else {
		            this.hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
		        }
		}

		@Override
		public void retrieveFirstAndLastEntry() {
			  if (!this.hashMap.isEmpty()) {
		            String firstKey = this.hashMap.keySet().iterator().next();
		            String lastKey = null;

		            for (String key : this.hashMap.keySet()) {
		                lastKey = key;
		            }

		            System.out.println(firstKey + ": " + this.hashMap.get(firstKey) +
		                    " and " + lastKey + ": " + this.hashMap.get(lastKey));
		        }
		}

		@Override
		public void deleteEntryForKey(String key) {
			 System.out.println("Enter the key for delete");
		        String keyString = GetInput.getInstance().getNewRecord();
		        if (this.hashMap.containsKey(key)) {
		            this.hashMap.remove(key);
		            System.out.println("Operation successfully done !!!");
		        } else {
		            System.out.println("Key not found in records !!!");
		        }
		}

		@Override
		public void deleteAllEntries() {
			   this.hashMap.clear();
		        System.out.println("Operation successfully done !!!");
		}

		@Override
		public void sortEntriesByKeys() {
			 Map<String, String> sortedMap = this.hashMap.entrySet().stream()
		                .sorted(Map.Entry.comparingByKey())
		                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                        (e1, e2) -> e1, HashMap::new));

		        this.hashMap = sortedMap;
		        System.out.println(this.hashMap);
		    }
		}
	
	


