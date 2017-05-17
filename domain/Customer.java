package com.techm.domain;
//comments

public class Customer {


	private String custName;
	private String custAddress;
	private long custMobile;


	//parameterized constructor
	public Customer(String custName, String custAddress, long custMobile) {

		
		//if(custMobile.length == 10){
		this.custName = custName;
		this.custAddress = custAddress;
		this.custMobile = custMobile;

		/*}
		else
		{
			//InvalidDataException thrown
			try{
			throw new InvalidDataException("mobile no. not proper");
			}
			catch(Exception e)
			{

			}
		}*/

	}



	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAddress="
				+ custAddress + ", custMobile=" + custMobile + "]";
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public String getCustAddress() {
		return custAddress;
	}



	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}



	public long getCustMobile() {
		return custMobile;
	}



	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
















}
