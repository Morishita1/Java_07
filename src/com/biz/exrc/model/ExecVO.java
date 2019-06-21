package com.biz.exrc.model;

public class ExecVO {

	private String year;
	
	private int era;

	private int err;

	private int eaa;
	


	public ExecVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExecVO(String year) {
		super();
		this.year = year;
	}

	
	public ExecVO(int era, int err) {
		super();
		this.era = era;
		this.err = err;
	}


	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getEra() {
		return era;
	}

	public void setEra(int era) {
		this.era = era;
	}

	public int getErr() {
		return err;
	}

	public void setErr(int err) {
		this.err = err;
	}
	public int getEaa() {
		return eaa;
	}


	public void setEaa(int eaa) {
		this.eaa = eaa;
	}

}
