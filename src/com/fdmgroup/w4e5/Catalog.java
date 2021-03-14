package com.fdmgroup.w4e5;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends Item, E extends Number> {
	
private List<T> allItems =  new ArrayList<T>();

public List<T> getAllItems(){
	return allItems;
}
public void addItem(T item){
	allItems.add(item);
}
public T getItem(E id){
	for(T temp: allItems){
		if(temp.getId().equals(id)){
			return temp;
		}
	}
	return null;
}
public void removeItem(E uniqueId){
	for(int i=0; i<allItems.size();i++){
		if(allItems.get(i).getId().equals(uniqueId)){
				allItems.remove(i);
		}
	}
}
}