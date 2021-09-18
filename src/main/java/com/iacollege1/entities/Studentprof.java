package com.iacollege1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentprof {
	
	@Id
	private long id;
	private String name;
	private String ib11mid;
	private String ib11eoy;
	private String ibag;
	private String future1;
	private String future2;

	public Studentprof() {
	
	}
	
	public Studentprof(long id, String name, String ib11mid,String ib11eoy, String ibag, String future1, String future2) {
		
		super();
		this.id = id;
		this.name = name;
		this.ib11mid = ib11mid;
		this.ib11eoy = ib11eoy;
		this.ibag = ibag;
		this.future1 = future1;
		this.future2 = future2;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIb11mid() {
		return ib11mid;
	}

	public void setIb11mid(String ib11mid) {
		this.ib11mid = ib11mid;
	}

	public String getIb11eoy() {
		return ib11eoy;
	}

	public void setIb11eoy(String ib11eoy) {
		this.ib11eoy = ib11eoy;
	}

	public String getIbag() {
		return ibag;
	}

	public void setIbag(String ibag) {
		this.ibag = ibag;
	}

	public String getFuture1() {
		return future1;
	}

	public void setFuture1(String future1) {
		this.future1 = future1;
	}

	public String getFuture2() {
		return future2;
	}

	public void setFuture2(String future2) {
		this.future2 = future2;
	}
	
	
	
	}