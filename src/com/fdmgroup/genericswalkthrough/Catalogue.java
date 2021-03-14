package com.fdmgroup.genericswalkthrough;

import java.util.ArrayList;
import java.util.List;

public class Catalogue<T extends Item> {
	
private List<T> allItems =  new ArrayList<T>();

public List<T> getAllItems(){
	return allItems;
}
public void addItem(T item){
	allItems.add(item);
}
public T getItem(String id){
	for(T temp: allItems){
		if(temp.getUniqueId().equals(id)){
			return temp;
		}
	}
	return null;
}
public void removeItem(String uniqueId){
	for(int i=0; i<allItems.size();i++){
		if(allItems.get(i).getUniqueId().equals(uniqueId)){
				allItems.remove(i);
		}
	}
}
}

