package com.polyplay.pp.domain;

public class OrderVo {
	
	private int oidx;
	private int midx;
	private int cidx;
	private String oid;
	private int oPrice;
	private String oWriteday;
	private String oIp;
	
	

	public int getOidx() {
		return oidx;
	}
	public void setOidx(int oidx) {
		this.oidx = oidx;
	}
	public int getMidx() {
		return midx;
	}
	public void setMidx(int midx) {
		this.midx = midx;
	}
	public int getCidx() {
		return cidx;
	}
	public void setCidx(int cidx) {
		this.cidx = cidx;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}
	public String getoWriteday() {
		return oWriteday;
	}
	public void setoWriteday(String oWriteday) {
		this.oWriteday = oWriteday;
	}
	public String getoIp() {
		return oIp;
	}
	public void setoIp(String oIp) {
		this.oIp = oIp;
	}

}
