package com.fdmgroup.w4e5;

public class Book implements Item{
	private int Id;
	private String Bookname;
	
//	public void setId(String id) {
//		this.Id=id;
//	}
	public void setName(String Bookname) {
		this.Bookname=Bookname;
	}

	public Number getId() {
		return Id;
	}
	@Override
	public void setId(Number id) {
		this.Id=(int) id;
	}


}
