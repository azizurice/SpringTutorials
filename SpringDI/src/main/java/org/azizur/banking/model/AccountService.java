package org.azizur.banking.model;

public interface AccountService {
	public void transferMoney(long sourceAcccountId, long destAccountId,double amount);
	public void depositeMoney(long accountId,double amount);
	public Account getAccount(long accountId);

}
