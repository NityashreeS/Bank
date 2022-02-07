package com.BankingApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomersData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long CustomerID;
	
	private String FName;
	private String LName;
	private String MName;
	private String Password;
	private String AdharCard;
	private String PanCard;
	private String Mobile;
	private String Email;
	private String Bdate;
	private String Address;
	private long AccountNumber;
	private String TransactionPin;
	private String Status;
	private String CreatedAt;
    private String UpadatedAt;
  
  
  
  
	@Override
public String toString() {
	return "CustomersData [CustomerID=" + CustomerID + ", FName=" + FName + ", LName=" + LName + ", MName=" + MName
			+ ", Password=" + Password + ", AdharCard=" + AdharCard + ", PanCard=" + PanCard + ", Mobile=" + Mobile
			+ ", Email=" + Email + ", Bdate=" + Bdate + ", Address=" + Address + ", AccountNumber=" + AccountNumber
			+ ", TransactionPin=" + TransactionPin + ", Status=" + Status + ", CreatedAt=" + CreatedAt + ", UpadatedAt="
			+ UpadatedAt + "]";
}
	public CustomersData(long customerID, String fName, String lName, String mName, String password, String adharCard,
		String panCard, String mobile, String email, String bdate, String address, Long accountNumber,
		String transactionPin, String status, String createdAt, String upadatedAt) {
	super();
	CustomerID = customerID;
	FName = fName;
	LName = lName;
	MName = mName;
	Password = password;
	AdharCard = adharCard;
	PanCard = panCard;
	Mobile = mobile;
	Email = email;
	Bdate = bdate;
	Address = address;
	AccountNumber = accountNumber;
	TransactionPin = transactionPin;
	Status = status;
	CreatedAt = createdAt;
	UpadatedAt = upadatedAt;
}
	public long getCustomerID() {
		return CustomerID;
	}
	public String getFName() {
		return FName;
	}
	public String getLName() {
		return LName;
	}
	public String getMName() {
		return MName;
	}
	public String getPassword() {
		return Password;
	}
	public String getAdharCard() {
		return AdharCard;
	}
	public String getPanCard() {
		return PanCard;
	}
	public String getMobile() {
		return Mobile;
	}
	public String getEmail() {
		return Email;
	}
	public String getBdate() {
		return Bdate;
	}
	public String getAddress() {
		return Address;
	}
	public Long getAccountNumber() {
		return AccountNumber;
		
	}
	public String getTransactionPin() {
		return TransactionPin;
	}
	public String getStatus() {
		return Status;
	}
	public String getCreatedAt() {
		return CreatedAt;
	}
	public String getUpadatedAt() {
		return UpadatedAt;
	}
	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setAdharCard(String adharCard) {
		AdharCard = adharCard;
	}
	public void setPanCard(String panCard) {
		PanCard = panCard;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setBdate(String bdate) {
		Bdate = bdate;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setAccountNumber(long l) {
		AccountNumber = l;
	}
	public void setTransactionPin(String transactionPin) {
		TransactionPin = transactionPin;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}
	public void setUpadatedAt(String upadatedAt) {
		UpadatedAt = upadatedAt;
	}
	

}
