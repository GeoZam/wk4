package com.fdmgroup.w4e5;

public interface Item<E extends Number> {
	public void setId(E id);
	public void setName(String name);
	public E getId();

}
