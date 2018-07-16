package com.polyplay.pp.domain;

public class PayVo {

	private int pidx;
	private String oid;
	private String pMethod;
	private int pPrice;
	private String pStatus;
	private String pDepositor;
	private String pWriteday;
	
	
	
	public int getPidx() {
		return pidx;
	}
	public void setPidx(int pidx) {
		this.pidx = pidx;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getpMethod() {
		return pMethod;
	}
	public void setpMethod(String pMethod) {
		this.pMethod = pMethod;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpStatus() {
		return pStatus;
	}
	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}
	public String getpDepositor() {
		return pDepositor;
	}
	public void setpDepositor(String pDepositor) {
		this.pDepositor = pDepositor;
	}
	public String getpWriteday() {
		return pWriteday;
	}
	public void setpWriteday(String pWriteday) {
		this.pWriteday = pWriteday;
	}
}
