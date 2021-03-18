package com.cg.eis.exceptions;

public class IdNotFoundException extends Exception {
	String msg;
	public IdNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
		
	}
	@Override
	public String toString() {
		return "IdNotFoundException [msg=" + msg + "]";
	}

}
