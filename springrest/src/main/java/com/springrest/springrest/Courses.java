package com.springrest.springrest;

import java.util.Date;

public class Courses {
	
	int cid;
	String cname;
	String ctype;
	
	public Courses(int cid, String cname, String ctype) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
}
