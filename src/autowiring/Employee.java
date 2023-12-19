package com.aswin.spring.springCoreAdvanced.autowiring;

public class Employee {

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
