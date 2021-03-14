package com.fdmgroup.genericswalkthrough;

public class Book implements Item{
	private String name;
	private String uniqueId;
	
	public void setName(String name) {
		this.name=name;
	}public void setUniqueId(String uniqueDd) {
		this.uniqueId=uniqueDd;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	

}
