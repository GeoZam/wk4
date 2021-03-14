package com.fdmgroup.w4e5;

public class Borrowers implements Item{
	private int Id;
	private String Borrowername;
	
//	public void setId(String id) {
//		this.Id=id;
//	}
	public void setName(String Borrowername) {
		this.Borrowername=Borrowername;
	}

//	public String getId() {
//		return Id;
//	}

	@Override
	public void setId(Number id) {
		this.Id=(int) id;
		
	}

	@Override
	public Number getId() {
		// TODO Auto-generated method stub
		return Id;
	}

}
