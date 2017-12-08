package com.java4u.dp.nullobjpattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getCustomer() {
		return "No customer is existing with the given name in Database.... ";
	}


}
