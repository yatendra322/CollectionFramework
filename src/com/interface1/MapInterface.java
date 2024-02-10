package com.interface1;

import java.util.Map;

public interface MapInterface {

	void insertKeyValue(String key, String value);

	void insertMultipleKeyValue(Map<String, String> keyValueMap);

	void updateValueForKey(String key, String newValue);

	void retrieveAllEntries();

	void retrieveFirstAndLastEntry();

	void deleteEntryForKey(String key);

	void deleteAllEntries();

	void sortEntriesByKeys();
}
