package com.dewasulton.bootcmp;

public class BankData {
	
	String NoRek, Name, Address ;
	
	public BankData(String NoRek, String Name, String Address) {
		this.NoRek = NoRek ;
		this.Name = Name ;
		this.Address = Address;
		
	}
	
	public String getNoRek() {
		return NoRek ;
	}
	public String getName() {
		return Name ;
	}
	public String getAddress() {
		return Address ;
	}
}
