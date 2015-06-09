package org.azizur.banking.model;

import java.util.Date;

public class Account {
	private long id;
	private String accountName;
	private Double accountBalance;
	private Date lastAccessDate;
	private Date created;
	
	// Constructors
	
	public Account(){
		
	}
	
	public Account(long id, String accountName, Double accountBalance) {
		
		this.id = id;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.lastAccessDate = new Date();
		this.created = new Date();
	}
	// Setter and Getter Methods
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getLastAccessDate() {
		return lastAccessDate;
	}
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName
				+ ", accountBalance=" + accountBalance + ", lastAccessDate="
				+ lastAccessDate + ", created=" + created + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountBalance == null) ? 0 : accountBalance.hashCode());
		result = prime * result
				+ ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((lastAccessDate == null) ? 0 : lastAccessDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountBalance == null) {
			if (other.accountBalance != null)
				return false;
		} else if (!accountBalance.equals(other.accountBalance))
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id != other.id)
			return false;
		if (lastAccessDate == null) {
			if (other.lastAccessDate != null)
				return false;
		} else if (!lastAccessDate.equals(other.lastAccessDate))
			return false;
		return true;
	}
	
	
	
}
