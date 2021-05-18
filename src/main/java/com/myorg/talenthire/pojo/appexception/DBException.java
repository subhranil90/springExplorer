package com.myorg.talenthire.pojo.appexception;

public final class DBException extends Throwable {
	private static final long serialVersionUID = 2955410192422681684L;

	public DBException() {
		super();
	}

	public DBException(String exceptionMsg) {
		super(exceptionMsg);
	}

	public DBException(String exceptionMsg, Throwable exceptionObj) {
		super(exceptionMsg, exceptionObj);
	}

	public DBException(Throwable exceptionObj) {
		super(exceptionObj);
	}

}
